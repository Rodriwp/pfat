<?xml version="1.0"?>

<xsl:stylesheet   version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="xml" indent="yes" encoding="ISO-8859-1" />
y
  <xsl:template match="/">
    <xsl:element name="directores" >
    <xsl:apply-templates select="//director"/>
    </xsl:element>
  </xsl:template>

  <xsl:template match="director">
    <xsl:copy>
        <xsl:value-of select="text()"/>
    </xsl:copy>
  </xsl:template>
</xsl:stylesheet>
