<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleListagemLivrosProxyid" scope="session" class="com.knight.estoque.servicos.ListagemLivrosProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleListagemLivrosProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleListagemLivrosProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleListagemLivrosProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.knight.estoque.servicos.ListagemLivros getListagemLivros10mtemp = sampleListagemLivrosProxyid.getListagemLivros();
if(getListagemLivros10mtemp == null){
%>
<%=getListagemLivros10mtemp %>
<%
}else{
        if(getListagemLivros10mtemp!= null){
        String tempreturnp11 = getListagemLivros10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        com.knight.estoque.servicos.Livro[] listarLivros13mtemp = sampleListagemLivrosProxyid.listarLivros();
if(listarLivros13mtemp == null){
%>
<%=listarLivros13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listarLivros13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listarLivros13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg019");
        int arg0_1idTemp  = Integer.parseInt(arg0_1id);
        String arg1_2id=  request.getParameter("arg121");
        int arg1_2idTemp  = Integer.parseInt(arg1_2id);
        com.knight.estoque.servicos.Livro[] listarLivrosPaginacao16mtemp = sampleListagemLivrosProxyid.listarLivrosPaginacao(arg0_1idTemp,arg1_2idTemp);
if(listarLivrosPaginacao16mtemp == null){
%>
<%=listarLivrosPaginacao16mtemp %>
<%
}else{
        String tempreturnp17 = null;
        if(listarLivrosPaginacao16mtemp != null){
        java.util.List listreturnp17= java.util.Arrays.asList(listarLivrosPaginacao16mtemp);
        tempreturnp17 = listreturnp17.toString();
        }
        %>
        <%=tempreturnp17%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>