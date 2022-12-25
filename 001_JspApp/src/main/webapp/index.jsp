<%@page import="java.util.ArrayList"%>

<html>
<body>
	<h2>Welcome to java application!</h2>

	<%
	int fno = 100;
	int sno = 200;
	out.println("The sum of two number is :" + (fno + sno));

	ArrayList<Integer> addNumber = new ArrayList<Integer>();
	addNumber.add(100);
	addNumber.add(200);
	addNumber.add(300);

	out.println("Added numbers :" + addNumber);
	%>
</body>
</html>
