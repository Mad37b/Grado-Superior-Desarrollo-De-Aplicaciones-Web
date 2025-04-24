<?php

namespace Tarea06;

class Tarea06operacionesService extends \SoapClient
{

    /**
     * @var array $classmap The defined classes
     */
    private static $classmap = array (
);

    /**
     * @param array $options A array of config values
     * @param string $wsdl The wsdl file to use
     */
    public function __construct(array $options = array(), $wsdl = null){
    
  foreach (self::$classmap as $key => $value) {
    if (!isset($options['classmap'][$key])) {
      $options['classmap'][$key] = $value;
    }
  }
      $options = array_merge(array (
  'features' => 1,
), $options);
      if (!$wsdl) {
        $wsdl = 'http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/servicio.wsdl';
      }
      parent::__construct($wsdl, $options);
    }

    /**
     * @param anyType $idparam
     * @return void
     */
    public function getPVP($idparam)
    {
      return $this->__soapCall('getPVP', array($idparam));
    }

    /**
     * @param anyType $codigoProducto
     * @param anyType $codigoTienda
     * @return void
     */
    public function getStock($codigoProducto, $codigoTienda)
    {
      return $this->__soapCall('getStock', array($codigoProducto, $codigoTienda));
    }

    /**
     * @return void
     */
    public function getFamilia()
    {
      return $this->__soapCall('getFamilia', array());
    }

    /**
     * @param anyType $paramFamilia
     * @return void
     */
    public function getcodigoFamilia($paramFamilia)
    {
      return $this->__soapCall('getcodigoFamilia', array($paramFamilia));
    }

}
