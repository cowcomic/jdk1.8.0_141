package com.sun.corba.se.PortableActivationIDL.LocatorPackage;


/**
* com/sun/corba/se/PortableActivationIDL/LocatorPackage/ServerLocationPerType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u141/9370/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, July 12, 2017 4:26:28 AM PDT
*/

public final class ServerLocationPerType implements org.omg.CORBA.portable.IDLEntity
{
  public String hostname = null;
  public com.sun.corba.se.PortableActivationIDL.ORBPortInfo ports[] = null;

  public ServerLocationPerType ()
  {
  } // ctor

  public ServerLocationPerType (String _hostname, com.sun.corba.se.PortableActivationIDL.ORBPortInfo[] _ports)
  {
    hostname = _hostname;
    ports = _ports;
  } // ctor

} // class ServerLocationPerType
