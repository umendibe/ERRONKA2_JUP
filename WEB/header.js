/**
 * Kudeatzen du menu desplegable edo azpimenuaren bistaratzea.
 *
 * Deskribapena:
 * - "submenu" elementua bistaratzen edo ezkutatzen du klik eginda menu botoian.
 * - Menu botoiko irudia biratzen da botoia sakatzen denean.
 * - Pantailako klikak menu botoitik kanpo egiten direnean, azpimenua itzali eta irudia hasierako modura itzuli.
 *
 * @function
 */
function desplegable() {
    // =======================================================
    // ELEMENTUAK LORTU
    // =======================================================
    const submenu = document.getElementById('submenu');
    const menuIcon = document.querySelector('#menuButton img');

    // Azpimenua irekita dagoen ala ez egiaztatu
    const isOpen = submenu.style.display === 'flex';

    // =======================================================
    // MENU BOTOIA KLIK EGITEAN
    // =======================================================
    if (isOpen) {
        // Menua itzali eta irudia lehengoratu
        submenu.style.display = 'none';
        menuIcon.style.transform = 'rotate(0deg)'; 
    } else {
        // Menua ireki eta irudia biratu
        submenu.style.display = 'flex';
        menuIcon.style.transform = 'rotate(-90deg)'; 
    }

    // =======================================================
    // KLIK KANPOAN: MENUA ITZALI
    // =======================================================
    window.addEventListener('click', (event) => {
        const menuButton = document.getElementById('menuButton');
        const submenu = document.getElementById('submenu');
        const menuIcon = document.querySelector('#menuButton img');

        // Menu botoitik kanpo klik eginez gero, itzali azpimenua
        if (!menuButton.contains(event.target)) {
            submenu.style.display = 'none';
            menuIcon.style.transform = 'rotate(0deg)';
        }
    });
}
