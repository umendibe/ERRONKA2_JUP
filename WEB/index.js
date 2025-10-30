const images = [
  'img2/pelikulak2/blackphone2_handia.png',
  'img2/pelikulak2/maspalomas_handia.png',
  'img2/pelikulak2/crepusculo_handia.jpg',
  'img2/pelikulak2/los_domingos_handia.jpg',
  'img2/pelikulak2/tom_y_jerry_Handia.jpg'
];

let index = 0;
const img = document.getElementById('blackphone2');

function eguneratuArgazkia() {
  if (!img) return;
  img.src = images[index];
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
