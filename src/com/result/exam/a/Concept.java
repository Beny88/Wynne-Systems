package com.result.exam.a;

public abstract class Concept
{
        private String id;

        protected Concept( String anId )
        {
                if ( anId == null )
                {
                        throw new NullPointerException( "id must not be null" );
                }

                this.id = anId;
        }

        public String getId()
        {
                return id;
        }

        public void setId(final String id)
        {
                this.id = id;
        }

        @Override
        public boolean equals(Object other)
        {
               return other != null &&
                       other.getClass().equals(getClass()) &&
                       id.equals(((Concept)other).id );
        }

        @Override
        public String toString()
        {
                return "Concept(" + id + ")";
        }
}
