<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">
    <xsl:output method="html" indent="yes" />
    <xsl:template match="/">
        <html>
            <head>
                <title>Armys</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
                      integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous"/>
            </head>
            <body>
                <a href="/armys" style="position: absolute; top: 15px; right: 15px">Back to Thymeleaf version</a>
                <div class="container">
                    <ul class="nav justify-content-center">
                        <li class="nav-item">
                            <a class="nav-link" href="/xslt/armys">Show armys</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/xslt/albums">Show albums</a>
                        </li>
                    </ul>
                    <xsl:apply-templates />
                </div>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="List">
        <table class="table table-striped table-dark table-hover">
            <caption style="caption-side: top">Armys</caption>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name Army</th>
                    <th>Albums</th>
                </tr>
            </thead>
            <xsl:for-each select="item">
                <tr>
                    <td>
                        <xsl:value-of select="id" />
                    </td>
                    <td>
                        <xsl:value-of select="nameArmy" />
                    </td>
                    <td>
                        <xsl:apply-templates select="albums"/>
                    </td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
    <xsl:template match="albums">
        <table class="table table-striped table-dark table-hover">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name Album</th>
                    <th>Song</th>
                    <th>Price</th>
                </tr>
            </thead>
            <xsl:for-each select="albums">
                <tr>
                    <td>
                        <xsl:value-of select="id" />
                    </td>
                    <td>
                        <xsl:value-of select="nameAlbum" />
                    </td>
                    <td>
                        <xsl:value-of select="song" />
                    </td>
                    <td>
                        <xsl:value-of select="price" />
                    </td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
</xsl:stylesheet>