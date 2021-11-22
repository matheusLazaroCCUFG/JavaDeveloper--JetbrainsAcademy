## JavaServer Faces (JSF)
### Model-View-Controller em JSF
* Model: JavaBeans
* View: Facelets
* Controller: FacesServlet
#### JavaBeans
* Ciclo de vida gerenciado pelo container
    * Tamb�m chamados de Managed Beans ou Backing Beans.
* Recebem duas anota��es:
    * Nome do Bean
        * Definido como anota��o do Bean
            * @ Named(nome)
        * O valor definido nessa anota��o pode ser referenciado nos Facelets
            * ```#{nome}```
        * Se o nome for omitido, � usado por conven��o o nome da classe iniciado com min�scula.
    * Escopo do Bean
        * Beans devem ser anotados com a identifica��o do seu escopo.
        * Essa anota��o indica quando o Bean deve ser instanciado.
        * Escopo dos Beans (mais importantes)
            * @RequestScoped
                * Instanciado para cada requisi��o/resposta
                * Exemplo: cadastro de usu�rio.
            * @SessionScoped
                * Instanciado uma vez no in�cio de cada sess�o
                * Mantido por toda a sess�o do usu�rio
                * Exemplo: carrinho de compras de um usu�rio
            * @ApplicationScoped
                * Instanciado uma vez quando o servidor de aplica��o inicia
                * Compartilhado por todos os usu�rios
                * Exemplo: log de usu�rios online em um f�rum
        * Escopo dos Beans (mais espec�ficos)
            * @ConversationScoped
                * Instanciado uma vez no in�cio de cada conversa��o
                * Uma sess�o pode ocnter v�rias conversa��es
                * Uma conversa��o pode ser encerrada pelo usu�rio
                * Exemplo: uma sess�o de chat com o vendedor dentro de uma aplica��o de e-commerce.
            * @FlowScoped
                * Instanciado uma vez no in�cio de cada conversa��o
                * Equivalente ao @ConversationScoped, mas voltado para "Faces Flows"
                * Exemplo: wizard de configura�ao de um site
            * @ViewScoped
                * Instanciado uma vez por p�gina
                * V�lido enquanto o usu�rio permanece na mesma p�gina
                * Exemplo: site com jogos em p�ginas independentes
            * @Dependent
                * O escopo � definido pelo escopo do componente que usa o bean
                * Exemplo: Bean de conversa��o de moedas, que pode ser usado sozinho ou dentro de um carrinho de compras.
        * Obs.: Beans com escopo Session, Application e Conversation devem implementar a interface Serializable.
* Navega��o entre p�ginas
    * Navega��o direta
        * O m�todo acionado retorna a p�gina que deve ser aberta
    * Navega��o indireta
        * O m�todo acionado retorna um r�tulo e o XML de configura��o vincula o r�tulo a uma p�gina.

