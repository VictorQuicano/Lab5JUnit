# Laboratorio 5: Pruebas Funcionales con Selenium y xUnit

Objetivo: Automatizar pruebas funcionales de aplicaciones web utilizando Selenium Web Driver y xUnit


## Alumno 

- QUICAÑO MIRANDA, Victor Alejandro

----
## Prueba con valores Negativos

| Escenario de Prueba | Valores de Prueba | Resultado Esperado |
|---------------------|-------------------|--------------------|
| pruebaNegativos     | -10, 20           | 2                  |
| prueba Negativos    | 40, -2394         | -957.6             |

## Prueba con No Validos

| Escenario de Prueba | Valores de Prueba | Resultado Esperado |
|---------------------|-------------------|--------------------|
| pruebaErrores       | -10, "xd"         | No Existe          |
| pruebaErrores       | npi, 873          | No Existe          |

## Prueba con valores Límite
| Escenario de Prueba               | Valores de Prueba                                   | Resultado Esperado   |
|-----------------------------------|-----------------------------------------------------|----------------------|
| Con valoresLimite (pruebaLimites) | -10000000000000000000000,0.342345836844663773663637 | -3.4234583684466E+19 |
| prueba Límites                    | 0.0...9 [9^(-10^60)],0.8944747474                   | 8.0502727266E-63     |
