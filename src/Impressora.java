public abstract class Impressora {

    static Imprimivel[] arrayDocumentos = new Imprimivel [10];

    public static void adicionarImprimivel(Imprimivel umImprimivel) {
        for (int i=0; i < arrayDocumentos.length; i++) {
            if (arrayDocumentos[i] == null) {
                arrayDocumentos [i] = umImprimivel;
                break;
            }
        }
    };

    public static void imprimirTudo(){
        for (int i=0; i< arrayDocumentos.length; i++) {
            if(arrayDocumentos[i] == null) {
                break;
            } else {
                arrayDocumentos[i].imprimir();
            }
        }
    };

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNome("Contrato 1");
        contrato.setTipo("Tipo 1");

        Documento documento = new Documento();
        documento.setNome("Documento 1");
        documento.setTipo("Tipo 1");

        Foto foto = new Foto();
        foto.setNome("Foto 1");
        foto.setTipo("Tipo 1");

        Impressora.adicionarImprimivel(contrato);
        Impressora.adicionarImprimivel(documento);
        Impressora.adicionarImprimivel(foto);

        Impressora.imprimirTudo();
    }

}
