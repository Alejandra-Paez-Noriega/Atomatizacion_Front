Feature: Crud de Candidatos en la Interfaz de Usuario (UI)

  Background:
    Given Estoy en la pagina candidato "http://localhost:4200/candidatos"

  @candidatePost
  Scenario Outline: Craeacion de un candidato con datos validos
    When Hago clic en el botón de crear candidato
    And Relleno los campos del formulario con "<nombre>", "<apellido>", "<cedula>", "<fecha_nacimiento>", "<celular>", "<ciudad>", "<email>", "<aspiracion_salarial>", "<seniority>", "<skills>", "<fuente>", "<experiencia_trabajo>", "<anios_experiencia>", "<level>", "<perfil>" y "<origen>"
    And Hago clic en el botón de guardar
    Then Veo los datos correctos del candidato con nombre: "<nombre>" y apellido: "<apellido>"

    Examples:
      | nombre      | apellido       | cedula     | fecha_nacimiento | celular     | ciudad       | email                        | aspiracion_salarial | seniority   | skills                                      | fuente       | experiencia_trabajo                  | anios_experiencia | level | perfil         | origen  |
      | Jose Miguel | Gonzalez Pinto | 1058796655 |       1999-10-15 |  3152268975 | Bogota       | Jose.pinto@example.com       |            10000000 | senior      | redes y seguridad de la información         | computrabajo |            7 años como líder técnico |                 7 |    12 | Líder Técnico  | Reclu   |
      | Ana María   | Rodríguez Díaz | 1234567890 |       1995-03-20 |  3001122334 | Medellín     | ana.rodriguez@example.com    |             5000000 | junior      | desarrollo web (HTML, CSS, JavaScript)      | LinkedIn     | 2 años como desarrolladora front-end |                 2 |     5 | Dev Front      | Interno |
      | Carlos      | Pérez Díaz     |  111222333 |       2003-12-31 |  3101112223 | Bogotá       | carlos.perez@example.com     |             1000000 | practicante | diseño UI/UX                                | Indeed       | recién egresado                      |                 0 |     1 | Dev Front      | Subk    |
      | Carlos      | Pérez          | abc123xyz  |       2005/01/10 | 123-456-789 | Cali         | carlos.example               | texto               | semi-senior | análisis                                    | Computrabajo |                    5 años en soporte | cinco             | diez  | Analista       | Empresa |
      |             |                |            |                  |             |              |                              |                     |             |                                             |              |                                      |                   |       |                |         |
      | Alejandra   | Castro Soto    |  999888777 |       1975-01-01 |  3190001112 | Cartagena    | alejandra.castro@example.com |            50000000 | experto     | gestión de proyectos, liderazgo estratégico | Reclu        |    20 años como CEO de multinacional |                20 |    15 | Líder Técnico  | Reclu   |
      | Daniel      | Rojas Mena     |  444555666 |       1998-08-15 |  3032223334 | Medellín     | daniel.rojas@example.com     |             7500000 | senior      | marketing digital                           | Indeed       |                  3 años en marketing |                 3 |     7 | Dev Front      | Interno |
      | Mónica      | Suárez León    |  777888999 |       1991-04-30 |  3143334445 | Cali         | monica.suarez@example.com    |             9000000 | semi-senior | ventas técnicas                             | Referido     |                     6 años en ventas |                 6 |     9 | Dev Backend    | Subk    |
      | Felipe      | Díaz Cruz      |  222333444 |       2001-06-20 |  3044445556 | Bogotá       | felipe.diaz@example.com      |             3500000 | junior      | soporte técnico                             | LinkedIn     |                     1 año en soporte |                 1 |     3 | Automatizador  | Interno |
      | Carolina    | Vargas Gil     |  666777888 |       1994-11-28 |  3125556667 | Barranquilla | carolina.vargas@example.com  |             8500000 | semi-senior | gestión de talento humano                   | Computrabajo |           4 años en recursos humanos |                 4 |     8 | Ing. Datos     | Reclu   |
      | Andrés      | Torres Mena    |  555666777 |       1987-02-12 |  3136667778 | Cartagena    | andres.torres@example.com    |            13000000 | senior      | desarrollo móvil (Android, iOS)             | Indeed       |      8 años como desarrollador móvil |                 8 |    13 | Dev Full Stack | Subk    |

  @candidatePut
  Scenario Outline: Modificación del correo electrónico de un candidato
    When Ingreso nombre: "<nombre>" y apellido: "<apellido>" en el campo de búsqueda
    And Hago clic en el botón de editar candidato
    And Modifico el campo de correo electrónico con "<nuevo_email>"
    And Hago clic en el botón de guardar
    Then Veo los datos correctos del candidato con nombre: "<nombre>", apellido: "<apellido>" y correo: "<nuevo_email>"

    Examples:
      | nombre      | apellido       | nuevo_email              |
      | Jose Miguel | Gonzalez Pinto | jose.pinto@accenture.com |
      | Ana María   | Rodríguez Díaz | ana.rodriguez            |
      | Carlos      | Pérez Díaz     | cperez.diaz@             |
      | Carlos      | Pérez          | carlos.p@example         |
      | Alejandra   | Castro Soto    | a.castro.soto@.net       |
      | Daniel      | Rojas Mena     | drojas@unmail            |
      | Mónica      | Suárez León    | monica.leon@.info        |
      | Felipe      | Díaz Cruz      | f.diaz.cruz1999@yahoo    |
      | Carolina    | Vargas Gil     | carolina.v@digitalio     |
      | Andrés      | Torres Mena    | andres.m@softwaredevcom  |
      | Ana María   | Rodríguez Díaz | ana..rodriguez@gmail.com |

  
@candidateGet
  Scenario Outline: Búsqueda de un candidato por nombre y apellido
    When Ingreso nombre: "<nombre>" y apellido: "<apellido>" en el campo de búsqueda
    Then Veo los datos correctos del candidato con nombre: "<nombre>" y apellido: "<apellido>"

    Examples:
      | nombre      | apellido       |
      | Jose Miguel | Gonzalez Pinto |
      | Ana María   | Rodríguez Díaz |
      | Carlos      | Pérez Díaz     |
      | Carlos      | Pérez          |
      | Alejandra   | Castro Soto    |
      | Daniel      | Rojas Mena     |
      | Mónica      | Suárez León    |
      | Felipe      | Díaz Cruz      |
      | Carolina    | Vargas Gil     |
      | Andrés      | Torres Mena    |

   @candidateDelete
  Scenario Outline: Eliminación de un candidato por nombre y apellido
    When Ingreso nombre: "<nombre>" y apellido: "<apellido>" en el campo de búsqueda
    And Hago clic en el botón de eliminar candidato
    And Confirmo la eliminación
    Then No encuentro al candidato con nombre: "<nombre>" y apellido: "<apellido>"

    Examples:
      | nombre      | apellido       |
      | Jose Miguel | Gonzalez Pinto |
      | Ana María   | Rodríguez Díaz |
      | Carlos      | Pérez Díaz     |
      | Carlos      | Pérez          |
      | Alejandra   | Castro Soto    |
      | Daniel      | Rojas Mena     |
      | Mónica      | Suárez León    |
      | Felipe      | Díaz Cruz      |
      | Carolina    | Vargas Gil     |
      | Andrés      | Torres Mena    |   