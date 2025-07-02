# Patrones de Diseño en Java

Este proyecto contiene implementaciones de varios patrones de diseño en Java, organizados por paquetes y utilizando Gradle como sistema de construcción.

## Estructura del Proyecto

- **builder**  
  Implementaciones del patrón Builder (con clases y records).

- **factory**  
  Ejemplos de:
  - *Abstract Factory*: Combos de restaurante.
  - *Factory Method*: Notificaciones.
  - *Simple Factory*: Formas geométricas.

- **prototype**  
  Implementaciones del patrón Prototype con robots.

- **singleton**  
  Implementaciones del patrón Singleton Robo Manager.

## Requisitos

- Java 17+
- Gradle 7+

## Cómo ejecutar

1. Clona el repositorio.
2. Compila el proyecto:

## Diagramas UML

### Patrón Bridge (Banco)

```mermaid
classDiagram
    class Banco {
        <<interface>>
        +realizarTransaccion(monto: double, tipo: String)
        +mostrarSaldo(saldo: double)
    }
    class BancoA {
        +realizarTransaccion(monto: double, tipo: String)
        +mostrarSaldo(saldo: double)
    }
    class BancoB {
        +realizarTransaccion(monto: double, tipo: String)
        +mostrarSaldo(saldo: double)
    }
    class Cuenta {
        <<abstract>>
        #banco: Banco
        +Cuenta(banco: Banco)
        +abstract mostrarTipoCuenta()
    }
    class CuentaAhorro {
        +mostrarTipoCuenta()
    }
    class CuentaCorriente {
        +mostrarTipoCuenta()
    }

    Banco <|.. BancoA
    Banco <|.. BancoB
    Cuenta <|-- CuentaAhorro
    Cuenta <|-- CuentaCorriente
    Cuenta o-- Banco
```

### Patrón Decorator (Bebidas)

```mermaid
classDiagram
    class Bebida {
        <<interface>>
        +getDescripcion() String
        +costo() double
    }
    class Cafe {
        +getDescripcion() String
        +costo() double
    }
    class BebidaDecorador {
        <<abstract>>
        #bebida: Bebida
        +BebidaDecorador(bebida: Bebida)
        +getDescripcion() String
        +costo() double
    }
    class BebidaConLeche {
        +getDescripcion() String
        +costo() double
    }
    class BebidaConChocolate {
        +getDescripcion() String
        +costo() double
    }

    Bebida <|.. Cafe
    Bebida <|.. BebidaDecorador
    BebidaDecorador <|-- BebidaConLeche
    BebidaDecorador <|-- BebidaConChocolate
    BebidaDecorador o-- Bebida
```
