function irekiDialogoa() {
    // Prevenir que el formulario se envíe
    event.preventDefault();
    
    // Baloreak lortu
    const pelikulaSelect = document.getElementById('pelikula-select');
    const pelikulaAukera = pelikulaSelect.value;
    const balorazioa = document.querySelector('input[name="balorazioa"]:checked');
    
    // Balidazioak
    if (!pelikulaAukera) {
        alert("Mesedez, aukeratu pelikula bat.");
        return;
    }
    
    if (!balorazioa) {
        alert("Mesedez, aukeratu balorazio bat (1-5).");
        return;
    }
    
    // Eskerrak
    alert("Sarrera bat erosi duzu - Eskerrik asko!");
    
    // Formularioa reiniziatu bidaltzean
    document.querySelector('.pelikula-form').reset();
    document.querySelector('.idazteko_input').value = "";
}