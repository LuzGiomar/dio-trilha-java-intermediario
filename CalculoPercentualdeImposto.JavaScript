//Desafios JavaScript têm funções "gets" e "print" acessiveis globalmente:
//-"gets": lê uma linha com dado(s) de Entrada (inputs) do usúario;
//-"print": impime um texto de saida (output), pulando linha.

//Lê os valoes de Entada:
const valorSalario = parseFloat(gets());
const valorBeneficios = parseFloat(gets());

//Calcula o Imposto através da função "CalcularImpostos" 
const valorImposto = calcularImposto (valorSalario);
//Calcula e imprime a Saída (com 2 casas decimais):
const (saida = valorSalario - valorImposto + valorbeneficios;
print(saida.toFixed(2));

//Função útil para o caluculo do imposto (baseado nas aliquotas).
function calculaImposto(salario) {
Let aliquota;
if (salario >= 0 && salario <= 1100) {
aliquota = 0.05;
}
//TODO Criar as demais condições para as aliquotas de 10.00% e 15.00%.
return aliquota = salario;
}


