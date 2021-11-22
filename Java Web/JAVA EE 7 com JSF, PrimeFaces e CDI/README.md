## Resumo Livro: Java EE 7 com JSF, PrimeFaces e CDI - 2� Edi��o, por Thiago Faria.
### Introdu��o ao desenvolvimento Web
* Especifica��es da JAVA EE
    * Servlets:
        * Componentes Java executados no servidor para gerar conte�do din�mico para a web, como HTML e XML.
    * JSP (JavaServer Pages)
        * Especifica��o de Servlets que permite que aplica��es web desenvolvidas em Java sejam mais f�ceis de manter. � similar �s tecnologias como ASP e PHP, por�m mais robusta por ter todas as facilidades da plataforma Java.
    * JSF ( JavaServer Faces)
        *  � um framework web baseado em Java que tem como objetivo simplificar o desenvolvimento de interfaces (telas) de sistemas para a web, atrav�s de um modelo de componentes reutiliz�veis. A proposta � que os sistemas sejam desenvolvidos com a mesma facilidade e produtividade que se desenvolve sistemas desktop (at� mesmo com ferramentas que suportam clicar-e-arrastar componentes).
    * JPA (Java Persistence API):
        *  � uma API padr�o do Java para persist�ncia
de dados, que usa um conceito de mapeamento objeto-relacional. Essa
tecnologia traz alta produtividade para o desenvolvimento de sistemas que
necessitam de integra��o com banco de dados. S� para citar, essa API
possibilita que voc� desenvolva aplica��es usando banco de dados sem
precisar escrever uma linha sequer de SQL.
    * EJB (Enterprise Java Beans):
        *  s�o componentes que executam em servidores
de aplica��o e possuem como principais objetivos, fornecer facilidade e
produtividade no desenvolvimento de componentes distribu�dos,
transacionados, seguros e port�veis.
* Protocolo HTTP
    * Protocolo stateless de comunica��o cliente-servidor
    * O cliente envia uma requisi��o para o sevidor, que processa a requisi��o e devolve uma resposta para o cliente, sendo que nenhuma informa��o � mantida no servidor em rela��o �s requisi��es previamente recebidas.
    * M�todos HTTP:
        * M�todo GET: obter o conte�do de um arquivo no servidor.
        * M�todo POST: enviar dados de formul�rios HTML ao servidor.
#### Desenvolvimento web com Java
* Acesso �s p�ginas:
    * Modelo request-response
        * request:
            * Solicita��o do cliente para que alguma a��o seja realizada.
        * response:
            * Realiza a solicita��o no servidor e responde para o cliente.
        * Implementado atrav�s da API de Servlets em Java.
            * Estende a funcionalidade de um servidor web para servir p�ginas din�micas aos navegadores, utilizando o protocolo HTTP.
        * Servidores web:
            * Servlet Container
            * Converte a requisi��o em um objeto do tipo HttpServletRequest
                * Passado aos componentes web, que podem executar qualquer c�digo Java para que possa ser gerado um conte�do din�mico.
            * O componente web devolve um objeto HttpServletResponse
                * Resposta ao cliente
                * Objeto gerado para que o conte�do gerado seja enviado ao navegador do usu�rio.
### Persist�ncia de dados dom JPA
#### Persist�ncia
* Preserva��o dos dados quendo um sistema � encerrado, promovendo a praticidade e usabilidade.
* Uso de Sistemas Gerenciadores de Banco de Dados relacionais e SQL
* Arquivos XML
* Arquivos texto
* etc
#### Mapeamento Objeto Relacional (ORM)
* T�cnica de programa��o para convers�o de dados entre banco de dados relacionais e linguagens de programa��o orientada a objetos.
    * Banco de dados:
        * Entidades s�o representadas por tabelas, com colunas que armazenem propriedades de diversos tipos.
        * Uma tabela pode se associar com outras e criar relacionamentos diversos.
    * Linugagem orientada a Objetos (Java)
        * Entidades s�o classes, e objetos dessas classes representam elementos do mundo real.
    * Compara��o entre o modelo relacional com o modelo orientado a objetos:

<table>
    <tr>
        <th>Modelo relacional</th>
      <td>tabela</td>
      <td>linha</td>
      <td>coluna</td>
      <td>-</td>
      <td>Chave estrangeira</td>
    </tr>
    <tr>
            <th>Modelo OO</th>
      <td>Classe</td>
      <td>Objeto</td>
      <td>Atributo</td>
      <td>M�todo</td>
      <td>Associa��o</td>
    </tr>
</table>
