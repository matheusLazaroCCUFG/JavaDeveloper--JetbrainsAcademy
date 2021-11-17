## Introdu��o ao JavaServer Faces 2.x
* https://netbeans.apache.org/kb/docs/web/jsf20-intro_pt_BR.html
* O JavaServer Faces (JSF) � um framework de interface de usu�rio (IU) para aplica��es Java Web. Foi projetado para complac�ncia, trabalhoa tarefa de escrever e manter as aplica��es que s�o executadas em um servidor de aplica��es Java e renderizar como UIs de volta a um cliente de destino. O JSF oferece facilidade de uso das seguintes formas:
    * Facilita a constru��o de uma IU usando um conjunto de componentes de IU reutiliz�veis
    * Simplifica a migra��o de dados da aplica��o para IU e provenientes dela
    * Ajude a gerenciar o estado da IU nas solicita��es do servidor
    * Oferece um modelo simples para conectar os eventos gerados pelo cliente ao c�digo da aplica��o do servidor
    * Permite personalizar os componentes de UI para que sejam facilmente constru�dos e reutilizados
* Para obter uma descri��o mais completa do framework JSF, consulte o Tutorial do Java EE 7, Cap�tulo 12: Desenvolvendo Tecnologia do JavaServer Faces <http://docs.oracle.com/javaee/7/tutorial/doc/jsf-develop.htm>.
* Este tutorial demonstra como voc� pode aplicar o suporte do JSF 2.xa uma aplica��o Web utilizando o NetBeans IDE. Comece adicionando o suporte ao framework JSF 2.xa uma aplica��o Web b�sica e continue para executar as seguintes tarefas:
    * crie um bean gerenciado pelo JSF para manipular os dados solicitados,
    * conecte o bean gerenciado �s p�ginas Web da aplica��o e
    * converta as pages Web em arquivos de modelo de Facelets.
* O NetBeans IDE oferece, h� muito tempo, suporte ao JavaServer Faces. A partir do lan�amento JSF 2.0 e Java EE 6, o NetBeans IDE oferece suporte para JSF 2.0 e JSF 2.1. Para obter mais informa��es, consulte Suporte JSF 2.x no NetBeans IDE .
* Para concluir este tutorial, voc� precisa dos seguintes recursos e softwares.

<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Software ou Recurso</font></font></th>
<th class="tableblock halign-left valign-top"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Vers�o Necess�ria</font></font></th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><a href="https://netbeans.org/downloads/index.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">NetBeans IDE</font></font></a></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Pacote Java EE 7.2, 7.3, 7.4, 8.0</font></font></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><a href="http://www.oracle.com/technetwork/java/javase/downloads/index.html"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">JDK (kit de desenvolvimento Java)</font></font></a></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">7 ou 8</font></font></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><a href="http://glassfish.dev.java.net/"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">GlassFish Server</font></font></a></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Edi��o de c�digo aberto 3.x ou 4</font></font></p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><a href="https://netbeans.org/projects/samples/downloads/download/Samples%252FJavaEE%252FjsfDemo.zip"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Projeto de Aplica��o Web `jsfDemo`</font></font></a></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">WL</font></font></p></td>
</tr>
</tbody>
</table>