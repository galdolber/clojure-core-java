package clojure;

import clojure.lang.*;

public final class core_generate_proxy_gen_bridge__5207 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "bit-or");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__3 = (java.lang.Object)0L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 Object cv3;
 Object totype14;
 Object to_types15;
 public core_generate_proxy_gen_bridge__5207(final Object cv3, final Object totype14, final Object to_types15) {
  super();
  this.cv3 = cv3;
  this.totype14 = totype14;
  this.to_types15 = to_types15;
 }
 public java.lang.Object invoke(java.lang.Object meth1, java.lang.Object dest2) {
  {
   Object pclasses3 = ((java.lang.Class[])((java.lang.reflect.Method)meth1).getParameterTypes());
   Object ptypes4 = ((IFn)this.to_types15).invoke(pclasses3);
   Object rclass5 = ((java.lang.Class)((java.lang.reflect.Method)meth1).getReturnType());
   Object rtype6 = ((IFn)this.totype14).invoke(rclass5);
   Object mname7 = ((java.lang.String)((java.lang.reflect.Method)meth1).getName());
   Object m8 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)mname7), (clojure.asm.Type)((clojure.asm.Type)rtype6), (clojure.asm.Type[])((clojure.asm.Type[])ptypes4));
   Object dtype9 = ((IFn)this.totype14).invoke(((java.lang.Class)((java.lang.reflect.Method)dest2).getDeclaringClass()));
   Object dm10 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.reflect.Method)dest2).getName())), (clojure.asm.Type)((clojure.asm.Type)((IFn)this.totype14).invoke(((java.lang.Class)((java.lang.reflect.Method)dest2).getReturnType()))), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)this.to_types15).invoke(((java.lang.Class[])((java.lang.reflect.Method)dest2).getParameterTypes()))));
   Object gen11 = new clojure.asm.commons.GeneratorAdapter((int)RT.intCast(clojure.lang.Numbers.or((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_BRIDGE)), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m8), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)this.cv3));
   ((clojure.asm.MethodAdapter)gen11).visitCode();
   ((clojure.asm.commons.GeneratorAdapter)gen11).loadThis();
   {
    long n__4366__auto__12 = clojure.lang.RT.longCast((int)clojure.lang.RT.count(((java.lang.Object)ptypes4)));
    {
     long i13 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i13, (long)n__4366__auto__12)) {
       ((clojure.asm.commons.GeneratorAdapter)gen11).loadArg((int)RT.intCast(i13));
       long i13___aux = clojure.lang.Numbers.unchecked_inc((long)i13);
       i13 = i13___aux;
       continue;
      } else {
      }
      break;
     }
    }
   }
   if (((java.lang.Class)((java.lang.Class)((java.lang.reflect.Method)dest2).getDeclaringClass())).isInterface()) {
    ((clojure.asm.commons.GeneratorAdapter)gen11).invokeInterface((clojure.asm.Type)((clojure.asm.Type)dtype9), (clojure.asm.commons.Method)((clojure.asm.commons.Method)dm10));
   } else {
    ((clojure.asm.commons.GeneratorAdapter)gen11).invokeVirtual((clojure.asm.Type)((clojure.asm.Type)dtype9), (clojure.asm.commons.Method)((clojure.asm.commons.Method)dm10));
   }
   ((clojure.asm.commons.GeneratorAdapter)gen11).returnValue();
   ((clojure.asm.commons.GeneratorAdapter)gen11).endMethod();
   return null;
  }
 }
}
