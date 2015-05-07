Name: ${user.name}
Email: ${user.email}

Test:
Name: ${user.getName()}
Email: ${user.getEmail()}

Test boolean:
Boolean: ${bool?c}

Test: ${"hello world"?ends_with("rld")?c}

Padding: ${"a"?left_pad(5, '%')}

Length: ${"hello world"?length}

Number: ${"3.34E10"?number}

Split:<#list "someMOOtestMOOtext"?split("moo"?upper_case) as e>	
	-${e}</#list>

WordList: <#list "  abc hello world yes"?word_list as e>
	-[${e}]</#list>