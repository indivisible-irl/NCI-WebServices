package w05_OOMiddleware.HelloApp;


/**
* HelloApp/HelloHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hello.idl
* 12 October 2012 20:26:44 o'clock IST
*/

abstract public class HelloHelper
{
  private static String  _id = "IDL:HelloApp/Hello:1.0";

  public static void insert (org.omg.CORBA.Any a, w05_OOMiddleware.HelloApp.Hello that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static w05_OOMiddleware.HelloApp.Hello extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (w05_OOMiddleware.HelloApp.HelloHelper.id (), "Hello");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static w05_OOMiddleware.HelloApp.Hello read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_HelloStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, w05_OOMiddleware.HelloApp.Hello value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static w05_OOMiddleware.HelloApp.Hello narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof w05_OOMiddleware.HelloApp.Hello)
      return (w05_OOMiddleware.HelloApp.Hello)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      w05_OOMiddleware.HelloApp._HelloStub stub = new w05_OOMiddleware.HelloApp._HelloStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static w05_OOMiddleware.HelloApp.Hello unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof w05_OOMiddleware.HelloApp.Hello)
      return (w05_OOMiddleware.HelloApp.Hello)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      w05_OOMiddleware.HelloApp._HelloStub stub = new w05_OOMiddleware.HelloApp._HelloStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
