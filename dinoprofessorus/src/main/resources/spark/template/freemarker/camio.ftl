<!DOCTYPE html>
<html lang="ca">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Camió</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  </head>
  <body>
    <div class="container">
       <div class="row">
        <div class="panel panel-default">
          <div class="panel-heading"><h3>Conductor camió <b>${camio.numero}</b><h3></div>
          <div class="panel-body">${camio.conductor}</div>
        </div>
       </div>
       <ul class="list-group articles">
          <#list camio.articles as article>
                   <li class="list-group-item article">${article.nom}<span class="badge">${article.quantitat}</span></li>
           </#list>
       </ul>
    <div>
  </body>
 </html>
