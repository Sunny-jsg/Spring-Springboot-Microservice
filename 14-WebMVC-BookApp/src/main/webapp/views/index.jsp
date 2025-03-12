 <html>
<head>      
</head>
<body>

<div class="container">
    <h2>Book Details</h2>
    <form action ="book">
        bookId:<input type = "text" name ="id"/>
        <input type="submit" value="Search"/>
        </form>
        <hr/>
       
    <div class="book-details" id="bookDetails">
        Book Id :${book.bookId}<br/>
        Book Name :${book.bookName}<br/>
        Book Price :${book.bookPrice}<br/>
   

</body>
</html>

