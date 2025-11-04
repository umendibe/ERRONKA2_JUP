function bidali() {
    // Prevenir que el formulario se envíe
    event.preventDefault();

    // Baloreak lortu
    const pelikulaSelect = document.getElementById('pelikula-select');
    const pelikulaAukera = pelikulaSelect.value;
    const balorazioa = document.querySelector('input[name="balorazioa"]:checked');
    const c1 = document.getElementById("dialogpelikula");
    const c3 = document.getElementById("dialogbalorazioa");
    const c2 = document.getElementById("botoia1");
    
    // Balidazioak
     if (!pelikulaAukera) {
        irekiDialogo('dialogpelikula');
        return; 
    }

    if (!balorazioa) {
        irekiDialogo('dialogbalorazioa');
        return;
    }

    irekiDialogo('dialogeskerrak');


   

    // Formularioa reiniziatu bidaltzean
    document.querySelector('.pelikula-form').reset();
    document.querySelector('.idazteko_input').value = "";
       const radioButtons = document.querySelectorAll('input[name="balorazioa"]');
    radioButtons.forEach(radio => {
        radio.checked = false;
    });
}
    

function irekiDialogo(dialogoId) {
    const dialog = document.getElementById(dialogoId);
    dialog.showModal(); // Abrir el diálogo
}

function itxiDialogo(dialogoId) {
    const dialog = document.getElementById(dialogoId);
    dialog.close(); // Cerrar el diálogo
}