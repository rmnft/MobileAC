package calculadora.imc.control;

public class CalculadoraImc {

    public String calcularImc(double altura, double peso, int idade, String sexo) {
        double imc = peso / (altura * altura);

        if (idade == 2) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 15) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 17) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 19) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 14) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 18) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else {
                return "Sexo desconhecido";
            }
        } else if (idade == 4) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 14) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 18) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 14) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 18) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else {
                return "Sexo desconhecido";
            }
        } else if (idade == 6) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 14) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 18) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 13) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 18) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else {
                return "Sexo desconhecido";
            }
        } else if (idade == 8) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 14) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 20) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 13) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 19) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else {
                return "Sexo desconhecido";
            }
        } else if (idade == 10) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 14) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 20) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 14) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 20) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else {
                return "Sexo desconhecido";
            }
        } else if (idade == 12) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 14) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 20) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 14) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 16) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 22) {
                    return "Categoria IMC: Sobrepeso";
                } else {
                    return "Categoria IMC: Obesidade";
                }
            } else {
                return "Sexo desconhecido";
            }
        } else if (idade >= 18 && idade <= 65) {
            // Adulto section
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 16) {
                    return "Categoria IMC: Baixo peso muito grave";
                } else if (imc < 17) {
                    return "Categoria IMC: Baixo peso grave";
                } else if (imc < 18.5) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 25) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 30) {
                    return "Categoria IMC: Sobrepeso";
                } else if (imc < 35) {
                    return "Categoria IMC: Obesidade grau I";
                } else if (imc < 40) {
                    return "Categoria IMC: Obesidade grau II";
                } else {
                    return "Categoria IMC: Obesidade grau III (obesidade mórbida)";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 16) {
                    return "Categoria IMC: Baixo peso muito grave";
                } else if (imc < 17) {
                    return "Categoria IMC: Baixo peso grave";
                } else if (imc < 18.5) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc < 25) {
                    return "Categoria IMC: Peso normal";
                } else if (imc < 30) {
                    return "Categoria IMC: Sobrepeso";
                } else if (imc < 35) {
                    return "Categoria IMC: Obesidade grau I";
                } else if (imc < 40) {
                    return "Categoria IMC: Obesidade grau II";
                } else {
                    return "Categoria IMC: Obesidade grau III (obesidade mórbida)";
                }
            } else {
                return "Sexo desconhecido";
            }
        } else if (idade > 65) {
            // Senior section
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 21.9) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc <= 27) {
                    return "Categoria IMC: Peso normal";
                } else if (imc <= 30) {
                    return "Categoria IMC: Sobrepeso";
                } else if (imc <= 35) {
                    return "Categoria IMC: Obesidade grau I";
                } else if (imc <= 39.9) {
                    return "Categoria IMC: Obesidade grau II";
                } else {
                    return "Categoria IMC: Obesidade grau III (obesidade mórbida)";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 21.9) {
                    return "Categoria IMC: Baixo peso";
                } else if (imc <= 27) {
                    return "Categoria IMC: Peso normal";
                } else if (imc <= 32) {
                    return "Categoria IMC: Sobrepeso";
                } else if (imc <= 37) {
                    return "Categoria IMC: Obesidade grau I";
                } else if (imc <= 41.9) {
                    return "Categoria IMC: Obesidade grau II";
                } else {
                    return "Categoria IMC: Obesidade grau III (obesidade mórbida)";
                }
            } else {
                return "Sexo desconhecido";
            }
        } else {
            return "Categoria não especificada";
        }
    }
}