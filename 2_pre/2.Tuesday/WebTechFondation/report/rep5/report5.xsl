<?xml version="1.0" encoding="shift_jis" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" encoding="shift_jis" />

<xsl:template match="/">
<html>
<body>
<table border="3">
<xsl:apply-templates select="/�a������グ�����L���O2015"/>
</table>
</body>
</html>
</xsl:template>

<xsl:template match="/�a������グ�����L���O2015">
<caption>
2015�N�x<br />�a������グ�����L���O
</caption>
<tr>
<th></th>
<xsl:apply-templates select="./�����L���O"/>
</tr>
<tr><th>1��</th>
<xsl:apply-templates select="./�����L���O/�{[@���� = '1']"/>
</tr>
<tr><th>2��</th>
<xsl:apply-templates select="./�����L���O/�{[@���� = '2']"/>
</tr>
<tr><th>3��</th>
<xsl:apply-templates select="./�����L���O/�{[@���� = '3']"/>
</tr>
<tr><th>4��</th>
<xsl:apply-templates select="./�����L���O/�{[@���� = '4']"/>
</tr>
<tr><th>5��</th>
<xsl:apply-templates select="./�����L���O/�{[@���� = '5']"/>
</tr>
</xsl:template>

<xsl:template match="�����L���O">
<th>
<xsl:value-of select="./@�W������"/>
</th>
</xsl:template>

<xsl:template match="�{">
<td>
<b><xsl:value-of select="."/></b><br />
<xsl:value-of select="./@����"/><br />
<xsl:value-of select="./@�o�Ŏ�"/><br/>
��<xsl:value-of select="./@���i"/>
</td>
</xsl:template>

</xsl:stylesheet>
