function goraBueltatu() {
    const goraBueltatu = document.getElementById("goraBueltatu");

    window.addEventListener("scroll", () => {
        goraBueltatu.style.display = window.scrollY > 200 ? "block" : "none";
    });

    goraBueltatu.addEventListener("click", () => {
        window.scrollTo({ top: 0, behavior: "smooth" });
    }); 
}

goraBueltatu();