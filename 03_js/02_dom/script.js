function removeSecondNews() {
    let secondNews = document.querySelector("#news-list > li:nth-child(2)");
    secondNews.remove();
}
removeSecondNews();

// function addNews() {
//     let newsList = document.querySelector("#sport-news");
//     let li = document.createElement("li");
//     li.append("Niemcy ponownie mistrzami świata w piłce nożnej");
//     newsList.append(li);
// }
// addNews();

// function addDynamicClassToBullets() {
//     let secondBullets = document.querySelectorAll("ul > li:nth-child(2)");
//     const addDynamicClass = element => element.classList.add("dynamic");
//     secondBullets.forEach(addDynamicClass);
// }
// addDynamicClassToBullets();

// function addDynamicClassToH2() {
//     let h2Elements = document.getElementsByTagName("h2");
//     for (let i = 0; i < h2Elements.length; i++) {
//         const element = h2Elements[i];
//         element.classList.add("dynamic");
//     }
// }
// addDynamicClassToH2();

// function changeHeadings() {
//     let news = document.getElementById("news");
//     news.innerHTML = "Wesołe Newsy";
//     let sport = document.getElementById("sport");
//     sport.innerHTML = "Anty Sport";
// }

// setTimeout(changeHeadings, 3000);

// function showSportNews() {
//     let sportNews = document.querySelectorAll("ul#sport-news > li");
//     sportNews.forEach(elem => console.log(elem.innerHTML));
// }
// showSportNews();

// function showFirstNews() {
//     let newsList = document.getElementById("news-list");
//     console.log(newsList.getElementsByTagName("li").item(0).innerHTML);
// }
// showFirstNews();

// addDynamicClassToBullets();
// function addDynamicClassToBullets() {
//     let secondBullets = document.querySelectorAll("ul > li:nth-child(2)");
//     for (let i = 0; i < secondBullets.length; i++) {
//         const element = secondBullets[i];
//         element.classList.add("dynamic");
//     }
// }
// addDynamicClassToBullets();
// function addDynamicClassToH2() {
//     let h2Elements = document.getElementsByTagName("h2");
//     for (let i = 0; i < h2Elements.length; i++) {
//         const element = h2Elements[i];
//         element.classList.add("dynamic");
//     }
// }
// addDynamicClassToH2();