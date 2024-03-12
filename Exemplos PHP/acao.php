<!DOCTYPE HTML>
<html>
    <head>
        <title>Resposta</title>
    </head>
    <body>

      Olá <?php echo htmlspecialchars($_POST['nome']); ?>.
      Você tem <?php echo (int)$_POST['idade']; ?> anos.

    </body>
</html>


