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
    public function __construct(array $options = array(), $wsdl = null)
    {
    
  foreach (self::$classmap as $key => $value) {
    if (!isset($options['classmap'][$key])) {
      $options['classmap'][$key] = $value;
    }
  }
      $options = array_merge(array (
  'features' => 1,
), $options);
      if (!$wsdl) {
        $wsdl = 'C:/Users/Ulises III/Desktop/Estudios Académicos/Grado Superior Distancia/02 Entorno Servidor/03 Ejercicios/Tarea06/servidorSoap/servicio.wsdl';
      }
      parent::__construct($wsdl, $options);
    }

    /**
     * @param int $idparam
     * @return anyType
     */
    public function getPVP($idparam)
    {
      return $this->__soapCall('getPVP', array($idparam));
    }

    /**
     * @param int $codigoProducto
     * @param int $codigoTienda
     * @return anyType
     */
    public function getStock($codigoProducto, $codigoTienda)
    {
      return $this->__soapCall('getStock', array($codigoProducto, $codigoTienda));
    }

    /**
     * @return Array
     */
    public function getFamilia()
    {
      return $this->__soapCall('getFamilia', array());
    }

    /**
     * @param string $paramFamilia
     * @return Array
     */
    public function getcodigoFamilia($paramFamilia)
    {
      return $this->__soapCall('getcodigoFamilia', array($paramFamilia));
    }

}
