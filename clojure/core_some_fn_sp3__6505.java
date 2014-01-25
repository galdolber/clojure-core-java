package clojure;

import clojure.lang.*;

public final class core_some_fn_sp3__6505 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "some");
 }
 Object p11;
 Object p22;
 Object p33;
 public core_some_fn_sp3__6505(final Object p11, final Object p22, final Object p33) {
  super();
  this.p11 = p11;
  this.p22 = p22;
  this.p33 = p33;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  {
   Object or__3968__auto__5 = ((IFn)this).invoke(x1, y2, z3);
   Object __r4278 = or__3968__auto__5;
   if (__r4278 != null && !(__r4278 == Boolean.FALSE)) {
    return or__3968__auto__5;
   } else {
    return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_some_fn_sp3__6505_fn__6506(this.p11, this.p22, this.p33), args4);
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  {
   Object or__3968__auto__4 = ((IFn)this.p11).invoke(x1);
   Object __r4280 = or__3968__auto__4;
   if (__r4280 != null && !(__r4280 == Boolean.FALSE)) {
    return or__3968__auto__4;
   } else {
    {
     Object or__3968__auto__5 = ((IFn)this.p22).invoke(x1);
     Object __r4282 = or__3968__auto__5;
     if (__r4282 != null && !(__r4282 == Boolean.FALSE)) {
      return or__3968__auto__5;
     } else {
      {
       Object or__3968__auto__6 = ((IFn)this.p33).invoke(x1);
       Object __r4284 = or__3968__auto__6;
       if (__r4284 != null && !(__r4284 == Boolean.FALSE)) {
        return or__3968__auto__6;
       } else {
        {
         Object or__3968__auto__7 = ((IFn)this.p11).invoke(y2);
         Object __r4286 = or__3968__auto__7;
         if (__r4286 != null && !(__r4286 == Boolean.FALSE)) {
          return or__3968__auto__7;
         } else {
          {
           Object or__3968__auto__8 = ((IFn)this.p22).invoke(y2);
           Object __r4288 = or__3968__auto__8;
           if (__r4288 != null && !(__r4288 == Boolean.FALSE)) {
            return or__3968__auto__8;
           } else {
            {
             Object or__3968__auto__9 = ((IFn)this.p33).invoke(y2);
             Object __r4290 = or__3968__auto__9;
             if (__r4290 != null && !(__r4290 == Boolean.FALSE)) {
              return or__3968__auto__9;
             } else {
              {
               Object or__3968__auto__10 = ((IFn)this.p11).invoke(z3);
               Object __r4292 = or__3968__auto__10;
               if (__r4292 != null && !(__r4292 == Boolean.FALSE)) {
                return or__3968__auto__10;
               } else {
                {
                 Object or__3968__auto__11 = ((IFn)this.p22).invoke(z3);
                 Object __r4294 = or__3968__auto__11;
                 if (__r4294 != null && !(__r4294 == Boolean.FALSE)) {
                  return or__3968__auto__11;
                 } else {
                  return ((IFn)this.p33).invoke(z3);
                 }
                }
               }
              }
             }
            }
           }
          }
         }
        }
       }
      }
     }
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  {
   Object or__3968__auto__3 = ((IFn)this.p11).invoke(x1);
   Object __r4296 = or__3968__auto__3;
   if (__r4296 != null && !(__r4296 == Boolean.FALSE)) {
    return or__3968__auto__3;
   } else {
    {
     Object or__3968__auto__4 = ((IFn)this.p22).invoke(x1);
     Object __r4298 = or__3968__auto__4;
     if (__r4298 != null && !(__r4298 == Boolean.FALSE)) {
      return or__3968__auto__4;
     } else {
      {
       Object or__3968__auto__5 = ((IFn)this.p33).invoke(x1);
       Object __r4300 = or__3968__auto__5;
       if (__r4300 != null && !(__r4300 == Boolean.FALSE)) {
        return or__3968__auto__5;
       } else {
        {
         Object or__3968__auto__6 = ((IFn)this.p11).invoke(y2);
         Object __r4302 = or__3968__auto__6;
         if (__r4302 != null && !(__r4302 == Boolean.FALSE)) {
          return or__3968__auto__6;
         } else {
          {
           Object or__3968__auto__7 = ((IFn)this.p22).invoke(y2);
           Object __r4304 = or__3968__auto__7;
           if (__r4304 != null && !(__r4304 == Boolean.FALSE)) {
            return or__3968__auto__7;
           } else {
            return ((IFn)this.p33).invoke(y2);
           }
          }
         }
        }
       }
      }
     }
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  {
   Object or__3968__auto__2 = ((IFn)this.p11).invoke(x1);
   Object __r4306 = or__3968__auto__2;
   if (__r4306 != null && !(__r4306 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    {
     Object or__3968__auto__3 = ((IFn)this.p22).invoke(x1);
     Object __r4308 = or__3968__auto__3;
     if (__r4308 != null && !(__r4308 == Boolean.FALSE)) {
      return or__3968__auto__3;
     } else {
      return ((IFn)this.p33).invoke(x1);
     }
    }
   }
  }
 }
 public java.lang.Object invoke() {
  return null;
 }
 public int getRequiredArity() {
  return 3;
 }
}
