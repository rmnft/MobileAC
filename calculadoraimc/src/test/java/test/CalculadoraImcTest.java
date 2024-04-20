package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import calculadora.imc.control.CalculadoraImc;doraImc;

public class CalculadoraImcTest {

        @Test
        public void testCrianca2AnosBaixoPesoMasculino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(0.8, 8.0, 2, "masculino"));
        }

        @Test
        public void testCrianca2AnosPesoNormalMasculino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(0.8, 10.0, 2, "masculino"));
        }

        @Test
        public void testCrianca2AnosSobrepesoMasculino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(0.8, 12.0, 2, "masculino"));
        }

        @Test
        public void testCrianca2AnosObesidadeMasculino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(0.8, 20.0, 2, "masculino"));
        }

        @Test
        public void testCrianca2AnosBaixoPesoFeminino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(0.8, 8.0, 2, "feminino"));
        }

        @Test
        public void testCrianca2AnosPesoNormalFeminino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(0.8, 10.0, 2, "feminino"));
        }

        @Test
        public void testCrianca2AnosSobrepesoFeminino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(0.8, 11.0, 2, "feminino"));
        }

        @Test
        public void testCrianca2AnosObesidadeFeminino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(0.8, 20.0, 2, "feminino"));
        }

        @Test
        public void testCrianca4AnosBaixoPesoMasculino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(1.0, 12.0, 4, "masculino"));
        }

        @Test
        public void testCrianca4AnosPesoNormalMasculino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(1.0, 15.0, 4, "masculino"));
        }

        @Test
        public void testCrianca4AnosSobrepesoMasculino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(1.0, 16.0, 4, "masculino"));
        }

        @Test
        public void testCrianca4AnosObesidadeMasculino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(1.0, 24.0, 4, "masculino"));
        }

        @Test
        public void testCrianca4AnosBaixoPesoFeminino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(1.0, 11.0, 4, "feminino"));
        }

        @Test
        public void testCrianca4AnosPesoNormalFeminino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(1.0, 14.0, 4, "feminino"));
        }

        @Test
        public void testCrianca4AnosSobrepesoFeminino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(1.0, 17.0, 4, "feminino"));
        }

        @Test
        public void testCrianca4AnosObesidadeFeminino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(1.0, 23.0, 4, "feminino"));
        }

        @Test
        public void testCrianca6AnosBaixoPesoMasculino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(1.1, 15.0, 6, "masculino"));
        }

        @Test
        public void testCrianca6AnosPesoNormalMasculino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(1.1, 18.0, 6, "masculino"));
        }

        @Test
        public void testCrianca6AnosSobrepesoMasculino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(1.1, 20.0, 6, "masculino"));
        }

        @Test
        public void testCrianca6AnosObesidadeMasculino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(1.1, 28.0, 6, "masculino"));
        }

        @Test
        public void testCrianca6AnosBaixoPesoFeminino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(1.1, 14.0, 6, "feminino"));
        }

        @Test
        public void testCrianca6AnosPesoNormalFeminino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(1.1, 17.0, 6, "feminino"));
        }

        @Test
        public void testCrianca6AnosSobrepesoFeminino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(1.1, 21.0, 6, "feminino"));
        }

        @Test
        public void testCrianca6AnosObesidadeFeminino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(1.1, 27.0, 6, "feminino"));
        }

        @Test
        public void testCrianca8AnosBaixoPesoMasculino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(1.2, 18.0, 8, "masculino"));
        }

        @Test
        public void testCrianca8AnosPesoNormalMasculino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(1.2, 22.0, 8, "masculino"));
        }

        @Test
        public void testCrianca8AnosSobrepesoMasculino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(1.2, 27.0, 8, "masculino"));
        }

        @Test
        public void testCrianca8AnosObesidadeMasculino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(1.2, 32.0, 8, "masculino"));
        }

        @Test
        public void testCrianca8AnosBaixoPesoFeminino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(1.2, 16.0, 8, "feminino"));
        }

        @Test
        public void testCrianca8AnosPesoNormalFeminino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(1.2, 20.0, 8, "feminino"));
        }

        @Test
        public void testCrianca8AnosSobrepesoFeminino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(1.2, 25.0, 8, "feminino"));
        }

        @Test
        public void testCrianca8AnosObesidadeFeminino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(1.2, 30.0, 8, "feminino"));
        }

        @Test
        public void testCrianca10AnosBaixoPesoMasculino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(1.4, 20.0, 10, "masculino"));
        }

        @Test
        public void testCrianca10AnosPesoNormalMasculino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(1.4, 30.0, 10, "masculino"));
        }

        @Test
        public void testCrianca10AnosSobrepesoMasculino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(1.4, 32.0, 10, "masculino"));
        }

        @Test
        public void testCrianca10AnosObesidadeMasculino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(1.4, 40.0, 10, "masculino"));
        }

        @Test
        public void testCrianca10AnosBaixoPesoFeminino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(1.4, 18.0, 10, "feminino"));
        }

        @Test
        public void testCrianca10AnosPesoNormalFeminino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(1.4, 29.0, 10, "feminino"));
        }

        @Test
        public void testCrianca10AnosSobrepesoFeminino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(1.4, 32.0, 10, "feminino"));
        }

        @Test
        public void testCrianca10AnosObesidadeFeminino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(1.4, 42.0, 10, "feminino"));
        }

        @Test
        public void testCrianca12AnosBaixoPesoMasculino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(1.5, 25.0, 12, "masculino"));
        }

        @Test
        public void testCrianca12AnosPesoNormalMasculino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(1.5, 35.0, 12, "masculino"));
        }

        @Test
        public void testCrianca12AnosSobrepesoMasculino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(1.5, 39.0, 12, "masculino"));
        }

        @Test
        public void testCrianca12AnosObesidadeMasculino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(1.5, 45.0, 12, "masculino"));
        }

        @Test
        public void testCrianca12AnosBaixoPesoFeminino() {
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                new CalculadoraImc().calcularImc(1.5, 22.0, 12, "feminino"));
        }

        @Test
        public void testCrianca12AnosPesoNormalFeminino() {
                Assert.assertEquals("Categoria IMC: Peso normal",
                                new CalculadoraImc().calcularImc(1.5, 34.0, 12, "feminino"));
        }

        @Test
        public void testCrianca12AnosSobrepesoFeminino() {
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                new CalculadoraImc().calcularImc(1.5, 37.0, 12, "feminino"));
        }

        @Test
        public void testCrianca12AnosObesidadeFeminino() {
                Assert.assertEquals("Categoria IMC: Obesidade",
                                new CalculadoraImc().calcularImc(1.5, 52.0, 12, "feminino"));
        }

        @Test
        public void testAdultoBaixoPesoMuitoGraveMasculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Baixo peso muito grave",
                                calculadoraImc.calcularImc(1.75, 40.0, 25, "masculino"));
        }

        @Test
        public void testAdultoBaixoPesoGraveMasculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Baixo peso grave",
                                calculadoraImc.calcularImc(1.75, 50.0, 30, "masculino"));
        }

        @Test
        public void testAdultoBaixoPesoMasculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                calculadoraImc.calcularImc(1.75, 55.0, 35, "masculino"));
        }

        @Test
        public void testAdultoPesoNormalMasculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Peso normal",
                                calculadoraImc.calcularImc(1.75, 60.0, 40, "masculino"));
        }

        @Test
        public void testAdultoSobrepesoMasculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Sobrepeso",
                                calculadoraImc.calcularImc(1.75, 80.0, 45, "masculino"));
        }

        @Test
        public void testAdultoObesidadeGrau1Masculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau I",
                                calculadoraImc.calcularImc(1.75, 105.0, 50, "masculino"));
        }

        @Test
        public void testAdultoObesidadeGrau2Masculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau II",
                                calculadoraImc.calcularImc(1.75, 120.0, 55, "masculino"));
        }

        @Test
        public void testAdultoObesidadeGrau3Masculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau III (obesidade mórbida)",
                                calculadoraImc.calcularImc(1.75, 140.0, 60, "masculino"));
        }

        @Test
        public void testAdultoBaixoPesoMuitoGraveFeminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Baixo peso muito grave",
                                calculadoraImc.calcularImc(1.65, 40.0, 25, "feminino"));
        }

        @Test
        public void testAdultoBaixoPesoGraveFeminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Baixo peso grave",
                                calculadoraImc.calcularImc(1.65, 45.0, 30, "feminino"));
        }

        @Test
        public void testAdultoBaixoPesoFeminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                calculadoraImc.calcularImc(1.65, 50.0, 35, "feminino"));
        }

        @Test
        public void testAdultoPesoNormalFeminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Peso normal",
                                calculadoraImc.calcularImc(1.65, 65.0, 40, "feminino"));
        }

        @Test
        public void testAdultoSobrepesoFeminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Sobrepeso", calculadoraImc.calcularImc(1.65, 70.0, 45, "feminino"));
        }

        @Test
        public void testAdultoObesidadeGrau1Feminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau I",
                                calculadoraImc.calcularImc(1.65, 85.0, 50, "feminino"));
        }

        @Test
        public void testAdultoObesidadeGrau2Feminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau II",
                                calculadoraImc.calcularImc(1.65, 100.0, 55, "feminino"));
        }

        @Test
        public void testAdultoObesidadeGrau3Feminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau III (obesidade mórbida)",
                                calculadoraImc.calcularImc(1.65, 135.0, 60, "feminino"));
        }

        @Test
        public void testSeniorBaixoPesoMasculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Baixo peso",
                                calculadoraImc.calcularImc(1.7, 50.0, 70, "masculino"));
        }

        @Test
        public void testSeniorPesoNormalMasculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Peso normal",
                                calculadoraImc.calcularImc(1.7, 70.0, 75, "masculino"));
        }

        @Test
        public void testSeniorSobrepesoMasculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Sobrepeso", calculadoraImc.calcularImc(1.7, 85.0, 80, "masculino"));
        }

        @Test
        public void testSeniorObesidadeGrau1Masculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau I",
                                calculadoraImc.calcularImc(1.7, 100.0, 85, "masculino"));
        }

        @Test
        public void testSeniorObesidadeGrau2Masculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau II",
                                calculadoraImc.calcularImc(1.7, 115.0, 90, "masculino"));
        }

        @Test
        public void testSeniorObesidadeGrau3Masculino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau III (obesidade mórbida)",
                                calculadoraImc.calcularImc(1.7, 135.0, 95, "masculino"));
        }

        @Test
        public void testSeniorBaixoPesoFeminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Baixo peso", calculadoraImc.calcularImc(1.6, 45.0, 70, "feminino"));
        }

        @Test
        public void testSeniorPesoNormalFeminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Peso normal",
                                calculadoraImc.calcularImc(1.6, 60.0, 75, "feminino"));
        }

        @Test
        public void testSeniorSobrepesoFeminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Sobrepeso", calculadoraImc.calcularImc(1.6, 75.0, 80, "feminino"));
        }

        @Test
        public void testSeniorObesidadeGrau1Feminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau I",
                                calculadoraImc.calcularImc(1.6, 90.0, 85, "feminino"));
        }

        @Test
        public void testSeniorObesidadeGrau2Feminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau II",
                                calculadoraImc.calcularImc(1.6, 105.0, 90, "feminino"));
        }

        @Test
        public void testSeniorObesidadeGrau3Feminino() {
                CalculadoraImc calculadoraImc = new CalculadoraImc();
                Assert.assertEquals("Categoria IMC: Obesidade grau III (obesidade mórbida)",
                                calculadoraImc.calcularImc(1.6, 125.0, 95, "feminino"));
        }

}