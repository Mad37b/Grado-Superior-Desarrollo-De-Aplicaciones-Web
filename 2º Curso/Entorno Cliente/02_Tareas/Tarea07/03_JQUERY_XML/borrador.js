$ajax(
    {
        url:["http://localhost/ejerciciosEntornoCliente/Tarea07/01_XML/lista.php?"+datos],
        type:[GET],
        success: (respuesta)=>{ $("#resultados").text(respuesta),$("#estado").text("Cargada.")},
        error: (error)=>{  console.error("Error en la petición:", error);
            $("#estado").text("Error al cargar los datos.");},
        complete:()=>{  console.log("Petición completada.");},
       async:true,
    }
)