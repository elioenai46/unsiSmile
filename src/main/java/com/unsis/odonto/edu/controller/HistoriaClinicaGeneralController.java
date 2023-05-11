/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 04/Mayo/2023
 *Fecha modificación: 04/Mayo/2023
 *Descripcion: Clases para el crud del cuestionario de los datos del paciente, 
 *donde los alumnos rellenaran el cuestionario con los datos recabados.
 */
package com.unsis.odonto.edu.controller;

import com.google.protobuf.Service;
import com.unsis.odonto.edu.entity.AntecedentesHeredofamiliares;
import com.unsis.odonto.edu.entity.AntecedentesPersonalesNoPatologicos;
import com.unsis.odonto.edu.entity.AntecedentesPersonalesPatologicos;
import com.unsis.odonto.edu.entity.ExamenFacial;
import com.unsis.odonto.edu.entity.Paciente;
import com.unsis.odonto.edu.entity.SignosVitales;
import com.unsis.odonto.edu.entity.Tutor;
import com.unsis.odonto.edu.service.IPacienteService;
import com.unsis.odonto.edu.service.PacienteServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HistoriaClinicaGeneralController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cadena = request.getParameter("accion");
        System.out.println(cadena);
        switch (cadena) {
            case "crear":
                crear(request, response);
                break;
            case "listar":
                //  listar(request, response);
                break;
            case "eliminar":
                //   eliminar(request, response);
                break;
            default:
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void crear(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAlumno/agregarPacientes.jsp");

        Paciente Paciente = new Paciente();
        SignosVitales signosVitales = new SignosVitales();
        ExamenFacial ExamenFacial = new ExamenFacial();
        AntecedentesHeredofamiliares antecedentesHeredofamiliares
                = new AntecedentesHeredofamiliares();
        AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos
                = new AntecedentesPersonalesNoPatologicos();
        AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos
                = new AntecedentesPersonalesPatologicos();
        Tutor tutor = new Tutor();

        // --------------- Datos personales ------------------------------------
        Paciente.setNombre1(request.getParameter("nombre1"));
        Paciente.setNombre2(request.getParameter("nombre2"));
        Paciente.setApellido1(request.getParameter("apellido1"));
        Paciente.setApellido2(request.getParameter("apellido2"));
                
        //Edad en la base de datos FEHCA DE Nacimineto 
        //Grado escolar en la base de datos
        //Teléfono en la base de datos

        Paciente.setDomicilio(request.getParameter("domicilio"));
        Paciente.setEstadoCivil(request.getParameter(
                "estadoCivil"));
        Paciente.setReligion(request.getParameter("religion"));
        //Fecha ingreso en la vista
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String fechaString = request.getParameter("fecha_ingreso");
        System.out.println("fecha :" + fechaString);
        //fecha = formatter.parse(fechaString);
        Paciente.setNacionalidad(request.getParameter(
                "nacionalidad"));
        Paciente.setLocalidad(request.getParameter("localidad"));

        //Email en la base de datos
        //Sexo y grupo etnico en la vista
        Paciente.setSexo(request.getParameter("sexo").charAt(0));
        Paciente.setGrupoEtnico(request.getParameter(
                "grupo_etnico"));
        //Motivo de la consulta
        //Ultima consulta dental

        //---- Datos si es menor de 18 años 
        //nombre del padre en la base de datos
        Paciente.setOcupacion(request.getParameter("ocupacion"));
        //nombre del madre en la base de datos
        //Estado civil de los padres
        //Nombre del médico familiar

        // --------------- SignosVitales -Completa------------------------------
        double peso = Double.parseDouble(request.getParameter("peso"));
        signosVitales.setPeso(peso);
        double estatura = Double.parseDouble(request.getParameter(
                "estatura"));
        signosVitales.setEstatura(estatura);
        double temperatura = Double.parseDouble(request.getParameter(
                "temperatura"));
        signosVitales.setTemperatura(temperatura);
        double frecuenciaCardiaca = Double.parseDouble(request.getParameter(
                "frecuenciaCardiaca"));
        signosVitales.setFrecuenciaCardiaca(frecuenciaCardiaca);
        double frecuenciaRespiratoria = Double.parseDouble(
                request.getParameter("frecuenciaRespiratoria"));
        signosVitales.setFrecuenciaRespiratoria(frecuenciaRespiratoria);
        double pesionArterial = Double.parseDouble(request.getParameter(
                "pesionArterial"));
        signosVitales.setPesionArterial(pesionArterial);
        double saturacionOxigeno = Double.parseDouble(request.getParameter(
                "saturacionOxigeno"));
        signosVitales.setSaturacionOxigeno(saturacionOxigeno);

        // ___--------------- ExamenFacial -------------------------------------
        ExamenFacial.setPerfil(request.getParameter("perfil"));
        ExamenFacial.setFrente(request.getParameter("frente"));
        ExamenFacial.setSeniasParticulares(request.getParameter(
                "seniasParticulares"));
        //Cóncavo, Convexo, Normofacial, Dolicofacial en la base de datos.

        // --------------- AntecedentesHeredofamiliares Completa ----------------
        boolean neoplacia = Boolean.parseBoolean(request.getParameter(
                "noplacia"));
        antecedentesHeredofamiliares.setNeoplacia(neoplacia);
        boolean diabetes = Boolean.parseBoolean(request.getParameter(
                "diabetes"));
        antecedentesHeredofamiliares.setDiabetes(diabetes);
        boolean hipertencion = Boolean.parseBoolean(request.getParameter(
                "hipertencion"));
        antecedentesHeredofamiliares.setHipertencion(hipertencion);
        boolean padecimientosMentalesNeurologicos = Boolean.parseBoolean(
                request.getParameter("padecimientosMentalesNeurologicos"));
        antecedentesHeredofamiliares.setPadecimientosMentalesNeurologicos(
                padecimientosMentalesNeurologicos);
        boolean obecidad = Boolean.parseBoolean(request.getParameter(
                "obecidad"));
        antecedentesHeredofamiliares.setObecidad(obecidad);
        boolean padecimientosHematologicos = Boolean.parseBoolean(
                request.getParameter("padecimientosHematologicos"));
        antecedentesHeredofamiliares.setPadecimientosHematologicos(
                padecimientosHematologicos);
        boolean malformacionesCongenitas = Boolean.parseBoolean(
                request.getParameter("malformacionesCongenitas"));
        antecedentesHeredofamiliares.setMalformacionesCongenitas(
                malformacionesCongenitas);
        boolean problemasCardiacos = Boolean.parseBoolean(
                request.getParameter("problemasCardiacos"));
        antecedentesHeredofamiliares.setProblemasCardiacos(problemasCardiacos);

        // --------------- AntecedentesPersonalesNoPatologicos completa --------
        boolean comeFrutasVerduras = Boolean.parseBoolean(request.getParameter(
                "comeFrutasVerduras"));
        antecedentesPersonalesNoPatologicos.setComeFrutasVerduras(
                comeFrutasVerduras);

        boolean comeCarne = Boolean.parseBoolean(request.getParameter(
                "comeCarne"));
        antecedentesPersonalesNoPatologicos.setComeCarne(comeCarne);

        boolean comeCereales = Boolean.parseBoolean(request.getParameter(
                "comeCereales"));
        antecedentesPersonalesNoPatologicos.setComeCereales(comeCereales);

        boolean comeAlimentosChatarra = Boolean.parseBoolean(request.
                getParameter("comeAlimentosChatarra"));
        antecedentesPersonalesNoPatologicos.setComeAlimentosChatarra(
                comeAlimentosChatarra);

        boolean tomaDosLitrosDeAguaXDia = Boolean.parseBoolean(request.
                getParameter("tomaDosLitrosDeAguaXDia"));
        antecedentesPersonalesNoPatologicos.setTomaDosLitrosDeAguaXDia(
                tomaDosLitrosDeAguaXDia);

        boolean unoMasRefrescosDia = Boolean.parseBoolean(request.getParameter(
                "unoMasRefrescosDia"));
        antecedentesPersonalesNoPatologicos.setUnoMasRefrescosDia(
                unoMasRefrescosDia);
        //  ------ integer              
        int SuViviendaTienePiso = Integer.parseInt(request.getParameter(
                "SuViviendaTienePiso"));
        antecedentesPersonalesNoPatologicos.setSuViviendaTienePiso(
                SuViviendaTienePiso);

        int materialDeVivienda = Integer.parseInt(request.getParameter(
                "materialDeVivienda"));

        int horasDuermeDia = Integer.parseInt(request.getParameter(
                "horasDuermeDia"));

        int bañoVecesXSemana = Integer.parseInt(request.getParameter(
                "bañoVecesXSemana"));

        int cepilladoXDia = Integer.parseInt(request.getParameter(
                "cepilladoXDia"));

        // --------------- Antecedentes Personales Patologicos -----------------
        boolean tabaquismo = Boolean.parseBoolean(request.getParameter("tabaquismo"));
        antecedentesPersonalesPatologicos.setTabaquismo(tabaquismo);

        boolean alcoholismo = Boolean.parseBoolean(request.getParameter("alcoholismo"));
        antecedentesPersonalesPatologicos.setAlcoholismo(alcoholismo);

        boolean otrasSustanciasPsicoactivasRecreativas = Boolean.parseBoolean(request.getParameter("otrasSustanciasPsicoactivasRecreativas"));
        antecedentesPersonalesPatologicos.setOtrasSustanciasPsicoactivasRecreativas(otrasSustanciasPsicoactivasRecreativas);

        boolean perforaciones = Boolean.parseBoolean(request.getParameter("perforaciones"));
        antecedentesPersonalesPatologicos.setPerforaciones(perforaciones);

        boolean tatuajes = Boolean.parseBoolean(request.getParameter("tatuajes"));
        antecedentesPersonalesPatologicos.setTatuajes(tatuajes);

        boolean neoplastia = Boolean.parseBoolean(request.getParameter("neoplastia"));
        antecedentesPersonalesPatologicos.setNeoplastia(neoplastia);

        boolean diabetis = Boolean.parseBoolean(request.getParameter("diabetis"));
        antecedentesPersonalesPatologicos.setDiabetes(diabetes);

        boolean hipertensionArterial = Boolean.parseBoolean(request.getParameter("hipertensionArterial"));
        antecedentesPersonalesPatologicos.setHipertensionArterial(hipertensionArterial);

        boolean pedecimientosMentales = Boolean.parseBoolean(request.getParameter("pedecimientosMentales"));
        antecedentesPersonalesPatologicos.setPedecimientosMentales(pedecimientosMentales);

        boolean obesidadDiagnosticada = Boolean.parseBoolean(request.getParameter("obesidadDiagnosticada"));
        antecedentesPersonalesPatologicos.setObesidadDiagnosticada(obesidadDiagnosticada);

        boolean padecimientosHematologicosLeucemia = Boolean.parseBoolean(request.getParameter("padecimientosHematologicos"));
        antecedentesPersonalesPatologicos.setPadecimientosHematologicos(padecimientosHematologicosLeucemia);

        boolean malformacionesCongenitasSindromes = Boolean.parseBoolean(request.getParameter("malformacionesCongenitasSindromes"));
        antecedentesPersonalesPatologicos.setMalformacionesCongenitasSindromes(malformacionesCongenitasSindromes);

        boolean problemasInfarto = Boolean.parseBoolean(request.getParameter("problemasCardiacos"));
        antecedentesPersonalesPatologicos.setProblemasCardiacos(problemasInfarto);

        boolean radioterapiaQuimioterapia = Boolean.parseBoolean(request.getParameter("radioterapiaQuimioterapia"));
        antecedentesPersonalesPatologicos.setRadioterapiaQuimioterapia(radioterapiaQuimioterapia);

        boolean padecimientosReumatologicos = Boolean.parseBoolean(request.getParameter("padecimientosReumatologicos"));
        antecedentesPersonalesPatologicos.setPadecimientosReumatologicos(padecimientosReumatologicos);

        boolean enfermedadesDelRinion = Boolean.parseBoolean(request.getParameter("enfermedadesDelRinion"));
        antecedentesPersonalesPatologicos.setEnfermedadesDelRinion(enfermedadesDelRinion);

        // falta en la base de datos Enfermedades hepáticas/Hepatitis.
        boolean ets = Boolean.parseBoolean(request.getParameter("ets"));
        antecedentesPersonalesPatologicos.setEts(ets);

        boolean hipertiroidismoHipotiroidismo = Boolean.parseBoolean(request.getParameter("hipertiroidismoHipotiroidismo"));
        antecedentesPersonalesPatologicos.setHipertiroidismoHipotiroidismo(hipertiroidismoHipotiroidismo);

        boolean enfermedadesDeViasAereas = Boolean.parseBoolean(request.getParameter("enfermedadesDeViasAereas"));
        antecedentesPersonalesPatologicos.setEnfermedadesDeViasAereas(enfermedadesDeViasAereas);

        boolean probleamasOculares = Boolean.parseBoolean(request.getParameter("probleamasOculares"));
        antecedentesPersonalesPatologicos.setProbleamasOculares(probleamasOculares);

        boolean enfermedadesDigestivas = Boolean.parseBoolean(request.getParameter("enfermedadesDigestivas"));
        antecedentesPersonalesPatologicos.setEnfermedadesDigestivas(enfermedadesDigestivas);

        boolean tuberculosis = Boolean.parseBoolean(request.getParameter("tuberculosis"));
        antecedentesPersonalesPatologicos.setTuberculosis(tuberculosis);

        boolean enfermedadesDeLaPiel = Boolean.parseBoolean(request.getParameter("enfermedadesDeLaPiel"));
        antecedentesPersonalesPatologicos.setEnfermedadesDeLaPiel(enfermedadesDeLaPiel);

        boolean trasplantesDeOrganos = Boolean.parseBoolean(request.getParameter("trasplantesDeOrganos"));
        antecedentesPersonalesPatologicos.setTrasplantesDeOrganos(trasplantesDeOrganos);

        // Parte 2----------Antecedentes personales patologicos ------------
        antecedentesPersonalesPatologicos.setHaSidoHospitalizado("haSidoHospitalizado");
        antecedentesPersonalesPatologicos.setHaTomadoUnMedicamentoRecientemente("haTomadoUnMedicamentoRecientemente");
        // cual ?
        // motivo ?
        antecedentesPersonalesPatologicos.setHaTenidoAlgunProblemaConAnestesia("haTenidoAlgunProblemaConAnestesia");
        // cual ?
        antecedentesPersonalesPatologicos.setAlergiaMedicamentoSustancia("alergiaMedicamentoSustancia");
        // cual ?
        antecedentesPersonalesPatologicos.setEmbarazo("embarazo");
        antecedentesPersonalesPatologicos.setObservaciones("observaciones");//observaciones del los meses de embarazo

    }

}
