html>

  <body>

      <h2>

        <%
           int x=Integer.parseInt(request.getParameter("a"));
           int y=Integer.parseInt(request.getParameter("b"));
           resp.getOutputStream().println(a+b);

        %>

     </h2>

    </body>

</html>

