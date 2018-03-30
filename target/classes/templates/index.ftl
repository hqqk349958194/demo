this is itmayiedu <br>
${name}

<#if sex==0>
	男
<#elseif sex==1>
	女
<#else>
	其他
	
</#if>
	<#list userlist as user>
		${user}
</#list>