package Model;

import java.util.List;

public class Tag {

//    criar tag ()
//    metodo adicionar tag ()

        private List<String> listaTag;

        public Tag(List<String> listaTag) {
            this.listaTag = listaTag;

        }
        public List<String> getListaTag() {
            return listaTag;
        }

        public void setListaTag(List<String> listaTag) {
            this.listaTag = listaTag;
        }

    @Override
    public String toString() {
        return String.format("A Tag %s foi adicionada", listaTag);
    }

    public void novaTag (Tag novaTag){
            if (listaTag.contains(novaTag)){
                System.out.println("Essa Tag já existe");
            }
        }
    }
