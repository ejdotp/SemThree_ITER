----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01/13/2024 01:59:57 PM
-- Design Name: 
-- Module Name: PriorityEncoder4Bit_tb - Dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity PriorityEncoder4Bit_tb is
--  Port ( );
end PriorityEncoder4Bit_tb;
-- E. JAGADEESWAR PATRO - 2241016309
architecture Dataflow of PriorityEncoder4Bit_tb is
component PriorityEncoder4Bit
port(d0, d1, d2, d3: in std_logic;
     x, y, v: out std_logic);
end component;
signal d0, d1, d2, d3, x, y, v: std_logic;
begin
uut: PriorityEncoder4Bit port map(d0=>d0, d1=>d1, d2=>d2, d3=>d3, x=>x, y=>y, v=>v);
stimulus: process
begin
d0<='0'; d1<='0'; d2<='0'; d3<='0'; wait for 10ns;
d0<='0'; d1<='0'; d2<='0'; d3<='1'; wait for 10ns;
d0<='0'; d1<='0'; d2<='1'; d3<='0'; wait for 10ns;
d0<='0'; d1<='0'; d2<='1'; d3<='1'; wait for 10ns;
d0<='0'; d1<='1'; d2<='0'; d3<='0'; wait for 10ns;
d0<='0'; d1<='1'; d2<='0'; d3<='1'; wait for 10ns;
d0<='0'; d1<='1'; d2<='1'; d3<='0'; wait for 10ns;
d0<='0'; d1<='1'; d2<='1'; d3<='1'; wait for 10ns;
d0<='1'; d1<='0'; d2<='0'; d3<='0'; wait for 10ns;
d0<='1'; d1<='0'; d2<='0'; d3<='1'; wait for 10ns;
d0<='1'; d1<='0'; d2<='1'; d3<='0'; wait for 10ns;
d0<='1'; d1<='0'; d2<='1'; d3<='1'; wait for 10ns;
d0<='1'; d1<='1'; d2<='0'; d3<='0'; wait for 10ns;
d0<='1'; d1<='1'; d2<='0'; d3<='1'; wait for 10ns;
d0<='1'; d1<='1'; d2<='1'; d3<='0'; wait for 10ns;
d0<='1'; d1<='1'; d2<='1'; d3<='1'; wait for 10ns;
end process;
end Dataflow;