# Curso de programação - Alura

## Java básico
### 01 - Básico

   Java [clique aqui](https://www.ibm.com/developerworks/br/java/tutorials/j-introtojava1/index.html) e entenda mais sobre.
    
    ---

### 02 - Orientação a Objetos
   - Leia [Os 4 pilares da Programação Orientada a Objetos](https://www.devmedia.com.br/os-4-pilares-da-programacao-orientada-a-objetos/9264)
    
- Neste artigo você vai ver:
	- Programação Estruturada vs Programação Orientada a Objetos
        - Os 4 pilares da Programação Orientada a Objetos ( Abstração / Encapsulamento / Herança / Polimorfismo )
        - Principais vantagens da POO
        - Exemplos de Linguagens Orientadas a Objetos
    
- [Código](https://github.com/angelozero/alura-java-basico/tree/master/02%20-%20Aula%20Java%20-%20Orientacao%20a%20Objeto/src/br/com/angeloakm/poo/biblioteca)

 ```java
        Biblioteca biblioteca = new Biblioteca();
```

---

### 03 - Usando *args* no método *main - public static void main(String[] args)*
- O que é o método main ?
        - O método main é um método associado à classe e não a um objeto específico da classe, assim ele é definido como um método estático. Adicionalmente, deve ser um método público para permitir sua execução a partir da máquina virtual Java.
       
     - [Info](http://www.dca.fee.unicamp.br/cursos/PooJava/classes/met_main.html)
    
    - E o args declarado como parâmetro no método, o que significa ?
        - Leia o artigo [Entendendo o parâmetro string args em Java](https://www.devmedia.com.br/entendendo-o-parametro-string-args-em-java/29245)
	
    - [Código](https://github.com/angelozero/alura-java-basico/blob/master/03%20-%20Aula%20Java%20-%20Metodos%20com%20Vargs%20e%20Objs/src/br/com/angeloakm/javabasico/vargs/Main.java)

    ```java
    public static void main(String[] args) {
        //{ código ...}
    }
    // método para somar N valores
	public static int somarN(int... numeros) {
		int retorno = 0;
		for (int i = 0; i < numeros.length; i++) {
			retorno += numeros[i];
		}
		return retorno;
	}
    ```
---

### 04 - Construtores
 - O construtor é definido como um método cujo nome deve ser o mesmo nome da classe e sem indicação do tipo de retorno -- nem mesmo void. O construtor é unicamente invocado no momento da criação do objeto através do operador new. O retorno do operador new é uma referência para o objeto recém-criado.
    
    -[Info](http://www.dca.fee.unicamp.br/cursos/PooJava/metodos/construtor.html)
    
    -[Código](https://github.com/angelozero/alura-java-basico/tree/master/04%20-%20Aula%20Java%20-%20Construtores/src/br/com/angeloakm/construtores)

    ```java
    //Passando os parâmetros do tamanho do quadrado na criação do objeto
    Quadrado quadrado = new Quadrado(12, 7);
    ```
---


 ### 05 - Elementos Estaticos
 - Usualmente, métodos definidos em uma classe são aplicados a objetos daquela classe. Há no entanto situações nas quais um método pode fazer uso apenas dos recursos de uma classe (e não das informaões associadas a cada objeto individualmente) para realizar sua tarefa.
    - [Info](http://www.dca.fee.unicamp.br/cursos/PooJava/classes/metclas.html)
    - [Código](https://github.com/angelozero/alura-java-basico/tree/master/05%20-%20Aula%20Java%20-%20Elementos%20Estaticos/src/br/com/angeloakm/elementos/estaticos)

    ```java
    public class Matematica {

        public static int somar(int x, int z) {
            return x + z;
        }

        public static int subtrair(int x, int z) {
            return x - z;
        }
    }

    // Invocando o método estático ( Classe.método(parâmetros) )
    int resultado = Matematica.somar(10, 5);
    ```

    ---

### 06 - Herança
 - Leia o artigo [Entendendo e Aplicando Herança em Java](https://www.devmedia.com.br/entendendo-e-aplicando-heranca-em-java/24544)
    - [Código](https://github.com/angelozero/alura-java-basico/tree/master/06%20-%20Aula%20Java%20-%20Heranca/src/br/com/angeloakm/heranca)
    ```java
        //Classe pai
        public class Pessoa {

            protected String nome;
            protected int idade;

            // { código ...}
        }


        // Aluno extende todos os atributos que a classe Pessoa tem, ou seja, Aluno agora passa a ter NOME / IDADE   e mais os atributos que apenas ela teria.
        //Classe filha
        public class Aluno extends Pessoa {

            //{ código }
        }

        // Professor extende todos os atributos que a classe Pessoa tem, ou seja, Professor agora passa a ter NOME / IDADE   e mais os atributos que apenas ela teria.
        //Classe filha
        public class Professor extends Pessoa {

            private double salario;
            private String disciplina;

            //{ código }
        }

    ```
---

### 07 - Polimorfismo
 - Leia o artigo [Uso de Polimorfismo em Java](https://www.devmedia.com.br/uso-de-polimorfismo-em-java/26140)
    - [Código](https://github.com/angelozero/alura-java-basico/tree/master/06%20-%20Aula%20Java%20-%20Polimorfismo/src/br/com/angeloakm/polimorfismo)
    ```java
        Animal cao = new Cachorro();
		cao.emitirSom();
    ```

---

### 08 - Classes Abstratas
 - Para este artigo tenho um projeto focado apenas em Interfaces e Classes Abstratas, acesse o projeto [interfaces-classes-abstratas](https://github.com/angelozero/java-interfaces-classe-abstratas)
    - Leia o artigo [Conceitos – Classes Abstratas: Programação Orientada a Objetos](https://www.devmedia.com.br/conceitos-classes-abstratas-programacao-orientada-a-objetos/18812)
    - [Código](https://github.com/angelozero/alura-java-basico/tree/master/07%20-%20Aula%20Java%20-%20Classes%20Abstratas/src/br/com/angeloakm/classe/abstrata)
    ```java
        public abstract class Item {

	        protected int posX;
	        protected int posY;

	        public abstract void pegar();

    }

    public class Moeda extends Item{

        @Override
        public void pegar() {
            System.out.println("Pegou MOEDA");

        }

    }

    public static void main(String[] args) {

		Moeda m = new Moeda();
		m.pegar();

    }
    ```

---

### 09 - Interfaces
 - Para este artigo tenho um projeto focado apenas em Interfaces e Classes Abstratas, acesse o projeto [interfaces-classes-abstratas](https://github.com/angelozero/java-interfaces-classe-abstratas)
  
  - Leia o artigo [Entendendo interfaces em Java](https://www.devmedia.com.br/entendendo-interfaces-em-java/25502)
  
  - [Código](https://github.com/angelozero/alura-java-basico/tree/master/07%20-%20Aula%20Java%20-%20Interfaces/src/br/com/angeloakm/interfaces)
  
  - Código básico mostrando uma funcionalidade de uma interface. Interface seria uma espécie de contrato, nesse trecho de código é simulado uma autenticação em dois bancos diferentes aonde ambos necessitam apenas de usuário e senha. Eu posso mudar de banco quantas vezes eu quiser, sem a necessidade de ficar alterando meu código toda vez que o banco for alterado.
  
  
```java
    public interface Autenticador {

	    public boolean autenticar(String user, String pswrd);

    }

    public class DBAutenticador implements Autenticador {

        @Override
        public boolean autenticar(String user, String pswrd) {
            if (!(user.isEmpty() && pswrd.isEmpty()))
                return true;
            else
                return false;
        }

    }

    public class FileAutenticador implements Autenticador {

        @Override
        public boolean autenticar(String user, String pswrd) {
            if (!(user.isEmpty() && pswrd.isEmpty()))
                return true;
            else
                return false;
        }

    }

    public static void main(String[] args) {

		String user = "angelo";
		String pswrd = "123";

		Autenticador login = obterAutenticadorPorConexaoDB();

		if (login.autenticar(user, pswrd))
			System.out.println("Usuario autenticado");
		else
			System.out.println("Usuario nao autenticado");
	}
 ```

---

 ### 10 - Exceções
 - Leia o artigo [Tratando exceções em Java](https://www.devmedia.com.br/tratando-excecoes-em-java/25514)
 
 - [Código](https://github.com/angelozero/alura-java-basico/tree/master/08%20-%20Aula%20Java%20-%20Excecoes/src/br/com/angeloakm/excecoes)
    ```java
        public class TesteException extends Exception {

            public TesteException(int code) {
                this.code = code;
            }
        }

        public class Main {
            public static void main(String[] args) {

                gerador();
                System.out.println("Fim do Programa");

            }

            public static void gerador() {
                try {
                    gerarErro();
                } catch (TesteException e) {
                    System.out.println("Erro " + e.getCode());
                } finally {
                    System.out.println("Fim do fluxo");
                }
            }

            private static void gerarErro() throws TesteException {
                throw new TesteException(100);
            }
        }


    ```
### 11 - Enums Wrappers e Autoboxing
 - Leia o artigo [Enums no Java](https://www.devmedia.com.br/enums-no-java/38764)
 
 - [Código](https://github.com/angelozero/alura-java-basico/tree/master/10%20-%20Aula%20Java%20-%20Enums%20Wrappers%20e%20Autoboxing/src/br/com/angeloakm)
    ```java
        public enum Sexo {

	    M("Masculino"), F("Feminino")

        private String sexo;

        Sexo(String sexoStr){
                this.sexoStr = sexoStr;
        }

        public String getSexoDesc() {
            return this.sexoStr;
        }

    ```

---

### 12 - Anotações em java
 - Leia o artigo (Entendendo Anotações em Java)[https://www.devmedia.com.br/entendendo-anotacoes-em-java/26772]
 - Leia o artigo (Como criar Anotações em Java)[https://www.devmedia.com.br/como-criar-anotacoes-em-java/32461]
 - Leia o artigo (Criando anotações no Java)[http://blog.alura.com.br/criando-anotacoes-no-java/]
    
    ```java
    
    // @Test é uma annotation do JUnit
    @Test
    public void testeConjuntoVazio() {
        Collection conjunto = new ArrayList();
        assertTrue(conjunto.isEmpty());
    }
    ```
    ---

### 13 - List, Arrays e Map
- Leia o artigo (Java Collections: Set, List e Iterator)[https://www.devmedia.com.br/java-collections-set-list-e-iterator/29637]
- Leia o artigo (Trabalhando com arrays em Java)[https://www.devmedia.com.br/trabalhando-com-arrays-em-java/25530]
- Leia o artigo (Conhecendo a interface Map do Java)[https://www.devmedia.com.br/conhecendo-a-interface-map-do-java/37463]
- [Código](https://github.com/angelozero/alura-java-basico/tree/master/12%20-%20Aula%20Java%20-%20Arrays%20List%20Conjutos%20e%20Mapas/src/br/com/angeloakm/listas)
```java
    /* --- ArrayList --- */
    ArrayList<Integer> lista = new ArrayList<Integer>();

    lista.add(1);
    lista.add(10);
    lista.add(20);

    /* --- Array Multidimensonal --- */
    int[][] array = new int[4][4];

    // array[1][0] = 1;
    // array[1][1] = 188;
    // array[1][2] = 13;

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            System.out.print(array[i][j] + " ");
        }
    }

    /* --- Hash Map --- */
    Map m = new HashMap();
    Livro l1 = new Livro();
    l1.setNome("Angelo");
    l1.setNumero(1);

    Livro l2 = new Livro();
    l2.setNome("Angelo Java");
    l2.setNumero(2);

    m.put(0, l1);
    m.put(1, l2);

    for (int i = 0; i < m.size(); i++) {
        Livro ret = (Livro) m.get(i);
        System.out.println(ret.nome + " " + ret.numero);
    }
```

---

### 14 - Reflection
 - Leia o artigo[Conhecendo Java Reflection](https://www.devmedia.com.br/conhecendo-java-reflection/29148)
    - [Código](https://github.com/angelozero/alura-java-basico/tree/master/14%20-%20Aula%20Java%20-%20Reflection/src/br/com/angeloakm/reflection)
    ```java
    public class Mapeador {
        private Map<Class<?>, Class<?>> mapa = new HashMap<>();

        public void load(String nomeArquivo) throws FileNotFoundException, IOException, ClassNotFoundException {

            Properties p = new Properties();
            p.load(new FileInputStream(nomeArquivo));

            for (Object key : p.keySet()) {
                Class<?> interfac = Class.forName(key.toString());
                Class<?> impl = Class.forName(p.get(key).toString());

                if(interfac.isInterface()){
                    System.out.println(interfac.getName() + " é uma interface");
                }

                if(!interfac.isAssignableFrom(impl)){
                    throw new RuntimeException("A classe " + impl.getName() + " não implementa " + interfac.getName());
                }

                mapa.put(interfac, impl);
            }

        }

        public Class<?> getImplementacao(Class<?> interf) {
            return mapa.get(interf);
        }
    }
    ```
--- 

## Links úteis
 - [GitHub Alura](https://github.com/alura-cursos/)
 - [Apostila - Algoritmos e Estruturas de Dados com Java](https://www.caelum.com.br/apostila-java-estrutura-dados/)
 - [Apostila - Java e Orientação a Objetos](https://www.caelum.com.br/download/caelum-java-objetos-fj11.pdf)
 - [Apostila - Java para Desenvolvimento Web](https://www.caelum.com.br/download/caelum-java-web-fj21.pdf)
 - [Apostila - Labaratório Java com estes, JSF e Desing Patterns](https://www.caelum.com.br/download/caelum-java-testes-jsf-web-services-design-patterns-fj22.pdf)
 - [Apostila - Desenvolvimento Web com HTML, CSS e JavaScript](https://www.caelum.com.br/download/caelum-html-css-javascript-php.pdf)
 - [Apostila - Algoritimos e Estrutura de Dados em Java](https://www.caelum.com.br/download/caelum-algoritmos-estruturas-dados-java-cs14.pdf)
 - [Entendendo a Stream API do Java 8](http://www.matera.com/br/2015/01/23/entendendo-a-stream-api-do-java-8/)
 - [Como não aprender orientação a objetos: Herança](http://blog.caelum.com.br/como-nao-aprender-orientacao-a-objetos-heranca/)
 - [Como não aprender Java e Orientação a Objetos: getters e setters](http://blog.caelum.com.br/nao-aprender-oo-getters-e-setters/)
 - [Apêndice - Sockets](https://www.caelum.com.br/apostila-java-orientacao-objetos/apendice-sockets/)
 
 - [Vídeo Classes Abstatas e Interface](https://www.youtube.com/watch?v=cjYBm1sGRjk)
 
 
 
(...) continua
