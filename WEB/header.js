function desplegable() {

        const submenu = document.getElementById('submenu');
        const menuIcon = document.querySelector('#menuButton img');

        const isOpen = submenu.style.display === 'flex';

        if (isOpen) {
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