const images = [
  { src: 'img2/pelikulak2/blackphone2_handia.png', text: 'BLACKPHONE 2' },
  { src: 'img2/pelikulak2/maspalomas_handia.png', text: 'MASPALOMAS' },
  { src: 'img2/pelikulak2/crepusculo_handia.jpg', text: 'CREPUSCULO: Nada Volverá a Ser Lo Mismo' },
  { src: 'img2/pelikulak2/los_domingos_handia.jpg', text: 'LOS DOMINGOS' },
  { src: 'img2/pelikulak2/tom_y_jerry_Handia.jpg', text: 'TOM Y JERRY: Aventura En El Tiempo' }
];


let index = 0;
const img = document.getElementById('blackphone2');

function eguneratuArgazkia() {
  if (!img) return;
  img.src = images[index].src;
  tituluak.textContent = images[index].text;

  img.classList.add('fade-out');

  setTimeout(() => {
    img.src = images[index].src;
    img.classList.remove('fade-out');
  }, 200);
}

function hurrengoIrudia() {
  if (index < images.length - 1) {
    index++;
    eguneratuArgazkia();
  }
}

function atzeraIrudia() {
  if (index > 0) {
    index--;
    eguneratuArgazkia();
  }
}

document.addEventListener('DOMContentLoaded', eguneratuArgazkia);
