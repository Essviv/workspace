<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
		<%
			String param=request.getParameter("param");
			if("1".equals(param)){
		%>
			关关雎鸠，在河之洲。<br />
			窈窕淑女，君子好逑。<br />
			参差荇菜，左右流之。<br />
			窈窕淑女，寤寐求之。<br />
			求之不得，寤寐思服。<br />
			悠哉悠哉，辗转反侧。<br />
			参差荇菜，左右采之。<br />
			窈窕淑女，琴瑟友之。<br />
			参差荇菜，左右芼之。<br />
			窈窕淑女，钟鼓乐之。<br />
		<%
			}else if("2".equals(param)){
		%>
			蒹葭苍苍，白露为霜。<br />
			所谓伊人，在水一方，<br />
			溯洄从之，道阻且长。<br />
			溯游从之，宛在水中央。<br />
			
			蒹葭萋萋，白露未晞。<br />
			所谓伊人，在水之湄。<br />
			溯洄从之，道阻且跻。<br />
			溯游从之，宛在水中坻。<br />
			
			蒹葭采采，白露未已。<br />
			所谓伊人，在水之涘。<br />
			溯洄从之，道阻且右。<br />
			溯游从之，宛在水中沚。<br />
		<%
			}else if("3".equals(param)){
		%>
			青青子衿，悠悠我心。<br />
			纵我不往，子宁不嗣音？<br />
			青青子佩，悠悠我思。<br />
			纵我不往，子宁不来？<br />
			挑兮达兮，在城阙兮。<br />
			一日不见，如三月兮。<br />
		<%
			}else{
		%>
			请使用1， 2，3选择要显示的诗歌...
		<%
			}
		%>
	</body>
</html>