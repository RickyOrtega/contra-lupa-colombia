package com.contralupa.ingestion.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ContratoSecopResponse(

        @JsonProperty("nombre_entidad")
        String nombreEntidad,

        @JsonProperty("nit_entidad")
        String nitEntidad,

        @JsonProperty("departamento")
        String departamento,

        @JsonProperty("ciudad")
        String ciudad,

        @JsonProperty("localizaci_n")
        String localizacion,

        @JsonProperty("orden")
        String orden,

        @JsonProperty("sector")
        String sector,

        @JsonProperty("rama")
        String rama,

        @JsonProperty("entidad_centralizada")
        String entidadCentralizada,

        @JsonProperty("proceso_de_compra")
        String procesoDeCompra,

        @JsonProperty("id_contrato")
        String idContrato,

        @JsonProperty("referencia_del_contrato")
        String referenciaDelContrato,

        @JsonProperty("estado_contrato")
        String estadoContrato,

        @JsonProperty("codigo_de_categoria_principal")
        String codigoCategoriaPrincipal,

        @JsonProperty("descripcion_del_proceso")
        String descripcionProceso,

        @JsonProperty("tipo_de_contrato")
        String tipoContrato,

        @JsonProperty("modalidad_de_contratacion")
        String modalidadContratacion,

        @JsonProperty("justificacion_modalidad_de")
        String justificacionModalidad,

        @JsonProperty("fecha_de_firma")
        LocalDateTime fechaFirma,

        @JsonProperty("fecha_de_inicio_del_contrato")
        LocalDateTime fechaInicioContrato,

        @JsonProperty("fecha_de_fin_del_contrato")
        LocalDateTime fechaFinContrato,

        @JsonProperty("fecha_inicio_liquidacion")
        LocalDateTime fechaInicioLiquidacion,

        @JsonProperty("fecha_fin_liquidacion")
        LocalDateTime fechaFinLiquidacion,

        @JsonProperty("fecha_de_notificaci_n_de_prorrogaci_n")
        LocalDateTime fechaDeNotificaciNDeProrrogacioN,

        @JsonProperty("fecha_inicio_obligaciones_posconsumo")
        LocalDateTime fechaInicioObligacionesPosconsumo,

        @JsonProperty("fecha_fin_obligaciones_posconsumo")
        LocalDateTime fechaFinObligacionesPosconsumo,

        @JsonProperty("condiciones_de_entrega")
        String condicionesEntrega,

        @JsonProperty("tipodocproveedor")
        String tipoDocumentoProveedor,

        @JsonProperty("documento_proveedor")
        String documentoProveedor,

        @JsonProperty("proveedor_adjudicado")
        String proveedorAdjudicado,

        @JsonProperty("es_grupo")
        String esGrupo,

        @JsonProperty("es_pyme")
        String esPyme,

        @JsonProperty("habilita_pago_adelantado")
        String habilitaPagoAdelantado,

        @JsonProperty("liquidaci_n")
        String liquidacion,

        @JsonProperty("obligaci_n_ambiental")
        String obligacionAmbiental,

        @JsonProperty("obligaciones_postconsumo")
        String obligacionesPostconsumo,

        @JsonProperty("obligaciones_posconsumo")
        String obligacionesPosconsumoAdicionales,

        @JsonProperty("reversion")
        String reversion,

        @JsonProperty("origen_de_los_recursos")
        String origenRecursos,

        @JsonProperty("destino_gasto")
        String destinoGasto,

        @JsonProperty("valor_del_contrato")
        BigDecimal valorContrato,

        @JsonProperty("valor_de_pago_adelantado")
        BigDecimal valorPagoAdelantado,

        @JsonProperty("valor_facturado")
        BigDecimal valorFacturado,

        @JsonProperty("valor_pendiente_de_pago")
        BigDecimal valorPendientePago,

        @JsonProperty("valor_pagado")
        BigDecimal valorPagado,

        @JsonProperty("valor_amortizado")
        BigDecimal valorAmortizado,

        @JsonProperty("valor_pendiente_de")
        BigDecimal valorPendiente,

        @JsonProperty("valor_pendiente_de_ejecucion")
        BigDecimal valorPendienteEjecucion,

        @JsonProperty("saldo_cdp")
        BigDecimal saldoCdp,

        @JsonProperty("saldo_vigencia")
        BigDecimal saldoVigencia,

        @JsonProperty("espostconflicto")
        String esPostconflicto,

        @JsonProperty("dias_adicionados")
        Integer diasAdicionados,

        @JsonProperty("puntos_del_acuerdo")
        String puntosAcuerdo,

        @JsonProperty("pilares_del_acuerdo")
        String pilaresAcuerdo,

        @JsonProperty("urlproceso")
        UrlProceso urlProceso,

        @JsonProperty("nombre_representante_legal")
        String nombreRepresentanteLegal,

        @JsonProperty("nacionalidad_representante_legal")
        String nacionalidadRepresentanteLegal,

        @JsonProperty("domicilio_representante_legal")
        String domicilioRepresentanteLegal,

        @JsonProperty("tipo_de_identificaci_n_representante_legal")
        String tipoIdentificacionRepresentanteLegal,

        @JsonProperty("identificaci_n_representante_legal")
        String identificacionRepresentanteLegal,

        @JsonProperty("g_nero_representante_legal")
        String generoRepresentanteLegal,

        @JsonProperty("presupuesto_general_de_la_nacion_pgn")
        BigDecimal presupuestoGeneralNacion,

        @JsonProperty("sistema_general_de_participaciones")
        BigDecimal sistemaGeneralParticipaciones,

        @JsonProperty("sistema_general_de_regal_as")
        BigDecimal sistemaGeneralRegalias,

        @JsonProperty("recursos_propios_alcald_as_gobernaciones_y_resguardos_ind_genas_")
        BigDecimal recursosPropiosEntidadesTerritoriales,

        @JsonProperty("recursos_de_credito")
        BigDecimal recursosCredito,

        @JsonProperty("recursos_propios")
        BigDecimal recursosPropios,

        @JsonProperty("codigo_entidad")
        String codigoEntidad,

        @JsonProperty("codigo_proveedor")
        String codigoProveedor,

        @JsonProperty("objeto_del_contrato")
        String objetoContrato,

        @JsonProperty("duraci_n_del_contrato")
        String duracionContrato,

        @JsonProperty("nombre_del_banco")
        String nombreBanco,

        @JsonProperty("tipo_de_cuenta")
        String tipoCuenta,

        @JsonProperty("n_mero_de_cuenta")
        String numeroCuenta,

        @JsonProperty("el_contrato_puede_ser_prorrogado")
        String contratoPuedeSerProrrogado,

        @JsonProperty("nombre_ordenador_del_gasto")
        String nombreOrdenadorGasto,

        @JsonProperty("tipo_de_documento_ordenador_del_gasto")
        String tipoDocumentoOrdenadorGasto,

        @JsonProperty("n_mero_de_documento_ordenador_del_gasto")
        String numeroDocumentoOrdenadorGasto,

        @JsonProperty("nombre_supervisor")
        String nombreSupervisor,

        @JsonProperty("tipo_de_documento_supervisor")
        String tipoDocumentoSupervisor,

        @JsonProperty("n_mero_de_documento_supervisor")
        String numeroDocumentoSupervisor,

        @JsonProperty("nombre_ordenador_de_pago")
        String nombreOrdenadorPago,

        @JsonProperty("tipo_de_documento_ordenador_de_pago")
        String tipoDocumentoOrdenadorPago,

        @JsonProperty("n_mero_de_documento_ordenador_de_pago")
        String numeroDocumentoOrdenadorPago,

        @JsonProperty("documentos_tipo")
        String documentosTipo,

        @JsonProperty("descripcion_documentos_tipo")
        String descripcionDocumentosTipo,

        @JsonProperty("direcci_n_de_ejecuci_n_del_contrato")
        String direccionEjecucionContrato,

        @JsonProperty("criterios_de_sostenibilidad_ambiental")
        String criteriosSostenibilidadAmbiental,

        @JsonProperty("requisitos_ambientales_en_las_especificaciones_t_cnicas")
        String requisitosAmbientalesEspecificacionesTecnicas,

        @JsonProperty("criterios_ambientales_en_la_evaluaci_n_de_las_ofertas")
        String criteriosAmbientalesEvaluacionOfertas,

        @JsonProperty("obligaciones_contractuales_o_poscontractuales_a_nivel_ambiental")
        String obligacionesContractualesAmbientales,

        @JsonProperty("uso_de_etiquetado_ecol_gico")
        String usoEtiquetadoEcologico,

        @JsonProperty("ultima_actualizacion")
        String ultimaActualizacion

) {
    public record UrlProceso(String url) {}
}
