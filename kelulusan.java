// Add a fade-in effect to the hero section
document.addEventListener("DOMContentLoaded", function() {
    const heroSection = document.getElementById("hero");
    heroSection.style.opacity = 0;
    setTimeout(function() {
        heroSection.style.opacity = 1;
    }, 500);
});