
document.addEventListener("DOMContentLoaded", function () {
    const startBtn = document.querySelector(".start-learning-btn");
    const targetSection = document.querySelector("#info-section");

    if (startBtn && targetSection) {
        startBtn.addEventListener("click", function (e) {
            e.preventDefault();
            targetSection.scrollIntoView({ behavior: "smooth", block: "start" });
        });
    } else {
        console.error("Button or Target Section not found!");
    }
});
