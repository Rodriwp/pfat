<?xml version="1.0"?>

<xsl:stylesheet   version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="xml" indent="yes" encoding="ISO-8859-1" />
y
  <xsl:template match="/">
    <xsl:element name="pelis" >
    <xsl:apply-templates select="//Pelicula"/>
    </xsl:element>
  </xsl:template>

  <xsl:template match="Pelicula">
    <xsl:if test="@año='2002'">
    <xsl:element name="peli">
        <xsl:attribute name="director">
        <xsl:value-of select="director/text()" />
      </xsl:attribute>
      <xsl:value-of select="titulo/text()" />
    </xsl:element>
    </xsl:if>
  </xsl:template>
</xsl:stylesheet>
