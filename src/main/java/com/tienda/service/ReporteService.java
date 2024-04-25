/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author maric
 */
public interface ReporteService {   
    public ResponseEntity<Resource>
            generaReporte(String reporte, //nombre del archivo jasper que esta dentro de reporte
                    Map<String, Object> parametros, //obtiene los parametros del reporte
                    String tipo)throws IOException;//tipo de reporte que vamos a descargar en la aplicacion
}
