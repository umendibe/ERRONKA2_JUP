function desplegable() {

        const submenu = document.getElementById('submenu');
        const menuIcon = document.querySelector('#menuButton img');

<<<<<<< HEAD
        const irekita = submenu.style.display === 'flex';

        if (irekita) {
=======
        const isOpen = submenu.style.display === 'flex';

        if (isOpen) {
>>>>>>> origin/feature/promozioak
            submenu.style.display = 'none';
            menuIcon.style.transform = 'rotate(0deg)'; 
        } else {
            submenu.style.display = 'flex';
            menuIcon.style.transform = 'rotate(-90deg)'; 
        }
    
    window.addEventListener('click', (event) => {
        const menuButton = document.getElementById('menuButton');
        const submenu = document.getElementById('submenu');
        const menuIcon = document.querySelector('#menuButton img');

        if (!menuButton.contains(event.target)) {
            submenu.style.display = 'none';
            menuIcon.style.transform = 'rotate(0deg)';
        }
    });

}