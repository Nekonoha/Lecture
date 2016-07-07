<?xml version="1.0" encoding="shift_jis" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" encoding="shift_jis" />

<xsl:template match="/">
<html>
<body>
<table border="3">
<xsl:apply-templates select="/和書売り上げランキング2015"/>
</table>
</body>
</html>
</xsl:template>

<xsl:template match="/和書売り上げランキング2015">
<caption>
2015年度<br />和書売り上げランキング
</caption>
<tr>
<th></th>
<xsl:apply-templates select="./ランキング"/>
</tr>
<tr><th>1位</th>
<xsl:apply-templates select="./ランキング/本[@順位 = '1']"/>
</tr>
<tr><th>2位</th>
<xsl:apply-templates select="./ランキング/本[@順位 = '2']"/>
</tr>
<tr><th>3位</th>
<xsl:apply-templates select="./ランキング/本[@順位 = '3']"/>
</tr>
<tr><th>4位</th>
<xsl:apply-templates select="./ランキング/本[@順位 = '4']"/>
</tr>
<tr><th>5位</th>
<xsl:apply-templates select="./ランキング/本[@順位 = '5']"/>
</tr>
</xsl:template>

<xsl:template match="ランキング">
<th>
<xsl:value-of select="./@ジャンル"/>
</th>
</xsl:template>

<xsl:template match="本">
<td>
<b><xsl:value-of select="."/></b><br />
<xsl:value-of select="./@著者"/><br />
<xsl:value-of select="./@出版社"/><br/>
￥<xsl:value-of select="./@価格"/>
</td>
</xsl:template>

</xsl:stylesheet>
