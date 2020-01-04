const showdown = require('showdown');
const markdownpdf = require("markdown-pdf")
const showdownHighlight = require("showdown-highlight");
const fs = require('fs')
const pdf = require('html-pdf');
const pdfDir = "../pdfs"


/**
 * Compile Lecture Summaries
 */
const converter = new showdown.Converter({extensions: [showdownHighlight]});
converter.setFlavor('github');


const pdfFormat = {
    format: "A4"
};

if (!fs.existsSync(pdfDir)) {
    fs.mkdirSync(pdfDir);
}


fs.readdirSync("../Lectures").forEach((f) => {
    console.log(f);
    const filenameNoExt = f.split(".")[0];
    const path = `../Lectures/${f}`;
    const data = fs.readFileSync(path).toString();
    const html = converter.makeHtml(data);
    fs.writeFileSync(`${pdfDir}/${filenameNoExt}.html`, html);
    markdownpdf().from.string(data).to(`${pdfDir}/${filenameNoExt}_.pdf`,()=>{});
    pdf.create(html, pdfFormat).toFile(`${pdfDir}/${filenameNoExt}.pdf`, (err, res) => {
        if (err) return console.log(err);
        console.log(res.filename, "is created");
    })
});