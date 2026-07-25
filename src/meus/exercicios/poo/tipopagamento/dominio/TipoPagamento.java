package meus.exercicios.poo.tipopagamento.dominio;

public enum TipoPagamento implements EstrategiaPagamento {
    PIX {
        @Override
        public double calcularTotal(double valorOriginal) {
            return valorOriginal - valorOriginal * 0.10;
        }
    },
    CARTAO_CREDITO {
        @Override
        public double calcularTotal ( double valorOriginal){
            return valorOriginal + valorOriginal * 0.05;
        }
    },
    BOLETO {
        @Override
        public double calcularTotal ( double valorOriginal){
            return valorOriginal - 2;
        }
    };
}
