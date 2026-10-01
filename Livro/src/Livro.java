    public class Livro {

        private String titulo;
        private boolean emprestado;



        public Livro(String titulo, boolean emprestado) {
            setTitulo(titulo);
            this.emprestado = emprestado;
        }
        public void emprestar(){
            if(emprestado){
                throw new IllegalArgumentException("Livro já emprestado!");
            }
            emprestado = true;
        }

        public void devolver(){
            if (!emprestado){
                throw new IllegalArgumentException("Livro já foi devolvido!");
            }
            emprestado = true;
        }


        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public boolean isEmprestado() {
            return emprestado;
        }

        public void setEmprestado(boolean emprestado) {
            this.emprestado = emprestado;
        }
        @Override
        public String toString() {
            return "Livro{" +
                    "titulo='" + titulo + '\'' +
                    ", emprestado=" + emprestado +
                    '}';
        }

    }
