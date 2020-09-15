function createParagraph() {
    console.log("asdf");
    let text = "Witaj świecie!";
    let textContainer = document.getElementById("text-container");
    simulateTextMachine(textContainer, text);
}

function simulateTextMachine(element, text) {
    for (let i = 0; i < text.length; i++) {
        const letter = text.charAt(i);
        console.log(letter);
        setTimeout(() => element.append(letter), i*100);
    } 
}

createParagraph();