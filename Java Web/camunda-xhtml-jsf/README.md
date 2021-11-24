## Camunda - xhtml - jsf
### Automa��o de documentos
* Documentos automatizados baseados em DDN (Document Design Notation)
* Automa��o de documentos
    * Representa��o visual do modelo mental para elabora��o de documentos complexos.
### Automa��o de regras de neg�cio
* Regras de neg�cio automatizadas, baseadas na nota��oo DMN (Decision Model and Notation)
    * nota��o sobre mapeamento dde decis�es, utilizada em conjunto com BPM.
    * Automa��o das regras de neg�cio por meio de tabelas de decis�o acopladas a processos e formul�rios.
    * Camunda BPM.
    * Composi��o:
        * Tabelas de decis�es a n�veis l�gicos.
        * Gera sa�das baseado nas regras e condi��es implementadas.
### Automa��o de processos
* Plataforma baseada em BPMS
* Implementado no Camunda BPM
* BPM: Business Process Management (Gerenciamento de Processos de Neg�cios)
    * Abordagem adapt�vel de gerenciamento com a finalidade de trazer informa��es de processos a serem executados.
    * Objetiva sistematizar e facilitar a complexa organiza��o de tomada de decis�es.
* Corejuridico:
    * Com inova��o e flexibilidade, o foco do modelo � otimizar documentos, recursos e centralizar dados.
    * Integrando as etapas jur�dicas, organizando uma agenda e atingindo metas, com aumento de produtividade e redu��o de esfor�o.
    * Automa��o de processos gerados por BPM mostra-se �ntegra em meio a alta complexidade de gerenciamento de equipes e, com alta personaliza��o.
## O sistema
### Configura��o da agenda de tarefas
* Subdivis�o em tr�s etapas:
    * Cria��o de vari�veis
    * Apresenta��o de vari�veis
    * Filtragem
* Clicando em: Menu-hamb�rguer -> 'Ferramentas' (Canto superior esquerdo da aba Flow)
    * Subt�pico: "</> vari�veis"
        * O bot�o [Nova vari�vel] � apresentado.
#### Cria��o de vari�veis
- Nome: O nome dado a vari�vel que aparecer� no filtro de
pesquisas.
- C�digo: O c�digo da vari�vel, se for uma vari�vel de
processo retornar� um dado real guardado dentro dela.
- [ X] Vari�vel local: Para extra��o de relat�rios
- Tipo de dado: O tipo esperado do valor interno.
- Escopo: Onde a vari�vel se encontra.
- Largura da coluna nos relat�rios: Quando exportado em
formato tabela, obrigat�rio para exporta��o sob pena de
erros.
- Usar no filtro de tarefas: Se dever� aparecer na aba de
�Filtro� para ser selecion�vel em �Apresentar� ou �Filtrar por�.
- Tipo de filtro: A forma cujo campo aparecer� em meio �
aba de filtragem das tarefas, caso selecionado em �Filtrar
por�.
- [ X] Pesquisa exata: Exige escrita correta.
- [Salvar]: Salva a vari�vel da forma como ela est�, podendo
ser editada ou exclu�da depois.
      
-----------
Caso selecionado como �Usar no filtro de tarefas:� poder�
ser selecionada no campo �Apresentar�
- Se selecionada, aparecer� na lista da agenda com seu
valor, caso existente.
Caso selecionado como �Usar no filtro de tarefas:� poder�
ser selecionada no campo �Filtrar por:�
- Se selecionada, aparecer� na lista da aba de filtro com um
campo para defini��o de seu valor.

### Cria��o de usu�rios
* - A cria��o de novos usu�rios � feita no menu de edi��o de
usu�rios, na hotbar acima do menu-hamb�rguer ao
selecionar a aba �COREJUR�, sua tela ser� recarregada com
um novo menu-hamb�rguer aberto.
* - Selecionando a aba �Usu�rios�, aparecer� o bot�o �Novo
usu�rio�
- �Nome:� o nome que aparecer� no sistema, que poder� ser
utilizado em chamadas nos forms.
- �Email:� o e-mail do usu�rio.
- �Fun��o:� #Deixar em branco#
- �Login:� O usu�rio que entra no sistema.
- �Senha:� A senha do usu�rio para entrar no sistema.
- �Confirma��o de Senha:� Repeti��o id�ntica de senha.
- �Status:� Sele��o entre Ativo/Inativo para permitir uso do
login para entrar no sistema.
- �Perfil:� Permiss�es bases de usu�rio.
- �Correspondente: [ X]� #Deixar em branco#
- �Usu�rio Flow: [ X]� Se o usu�rio ter� acesso ao flow
- �Restrito: [ X]� Restringe o usu�rio para n�o ver tarefa de
outras pessoas.
Restri��es
- �Vari�vel:� Restringe de acordo com o valor de uma
vari�vel, exemplo baseado na '�rea'.
- �Operador:� Define a opera��o de restri��o.
- �Valor:� Descreve o valor que dever� ser comparado com o
interno da vari�vel perante ao operador escolhido.
- �[Adicionar restri��o]� Acrescentar a restri��o acima ao
usu�rio, aparecendo em uma lista logo abaixo.

### Deploy de processos
- Ao selecionar �Processos�, no menu-hamb�rguer no canto
superior esquerdo, da aba Flow.
- �[Selecionar arquivo]� receber� um upload de .bpmn e .dmn
- �[Enviar arquivo]� ir� enviar os arquivos carregados, �
recomend�vel subir apenas um por vez.
- Caso j� exista um processo com o mesmo �Process ID�
(em caso de BPMN) ou mesmo �Decision ID� (caso DMN) ir�
substituir o atualmente existente.
- Altera��es dessa forma podem ser vistas selecionando a
seta, n�o s�o remov�veis, e fica salvo data e hora de
altera��o.
- Podem ser vistas e baixadas BPMN e DMN antigas.
- Ap�s altera��es de uma BPMN existente, siga para a
migra��o de processos.
### Desenho de diagramas
* Camunda BPM Modeler -> abri um novo arquivo BPMN
* Adicionar uma Pool/Participante
    * Selecion�-la e configurar:
    * Conte�do:
        - Id : � o ID gen�rico gerado automaticamente da pool. Mantenha-o.
        - Name : Ser� o nome dado a Pool, aparecendo na lateral esquerda.
        - Process Id : O nome de processo, utilizado pelo sistema para substitui��o e
        atualiza��o de BPMN, por padroniza��o, mantenha mantenha os caracteres
        alfanum�ricos em min�sculo e separado por h�fens apenas, sem uso de outros
        caracteres especiais.
        - Process Name : Por padroniza��o, mantenha o mesmo nome do �Name�
        acima.
        - Version Tag : #Deixe em branco#
        - [X] Executable : #Deixe selecionado#
### Formul�rios inteligentes
* Automa��o de formul�rios baseada em JSF (Java Server Faces)
* Formul�rios ricos, que implementam a interface com o usu�rio de acordo com as regras de neg�cio e interagem com:
    * Servi�os externos
    * Tabelas de decis�o
    * Documentos automatizados.
### Integra��o de sistemas
* 